package com.ggboy.item_bank.controller;

import com.aliyuncs.exceptions.ClientException;
import com.ggboy.item_bank.beans.User;
import com.ggboy.item_bank.service.SpecialtyService;
import com.ggboy.item_bank.service.UserService;
import com.ggboy.item_bank.utils.SmsUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
    @Resource
    private SpecialtyService specialtyService;
    @RequestMapping("/login")
    public String login(String username,String password,Model model,HttpSession session){
        try {
            userService.checkLogin(username,password);
            User user = userService.isRegister(username);
            if (user.getFlag() == 1){
                session.setAttribute("user",user);
                String spName = specialtyService.selectSpNameById(user.getTeacherSpecialty());
                String name = user.getTeacherName();
                model.addAttribute("TeacherName",name);
                model.addAttribute("SpecialtyName",spName);
                return "index";
            }else{
                model.addAttribute("msg","请等待管理员确认信息！");
                return "login";
            }
        } catch (Exception e) {
            model.addAttribute("msg","用户名或密码错误");
            return "login";
        }
    }

    @ResponseBody
    @RequestMapping("/sendMsg")
    public Object sendMsg(HttpSession session) throws ClientException {
        String userTel = (String) session.getAttribute("userTel");
        User user = userService.isRegister(userTel);
        if (user != null){
            return false;
        }else {
            SmsUtil.sendSms(session,userTel);
            return true;
        }
    }

    @ResponseBody
    @RequestMapping("/checkPhoneNum")
    public Object checkPhoneNum(HttpSession session,String userTel){
        Boolean b = userService.checkPhoneNum(userTel);
        if (b){
            return false;
        }else {
            session.setAttribute("userTel",userTel);
            return true;
        }
    }

    @RequestMapping("/regist")
    public String register(Model model, String code, User user,HttpSession session){
        Object phoneVarificationCode = session.getAttribute("phoneVarificationCode");
        String s = phoneVarificationCode.toString();
        if (code.equals(s)){
            if (userService.isRegister(user.getUsername()) == null){
            userService.addUser(user);
            return "login";
            }else {
                return "register";
            }
        }else {
            model.addAttribute("wrongMsg","验证码错误");
            return "register";
        }
    }

}
