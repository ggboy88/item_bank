package com.ggboy.item_bank.controller;

import com.ggboy.item_bank.beans.User;
import com.ggboy.item_bank.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private UserService userService;

    @RequestMapping("/toUpdateTeacher")
    public String updateTeacher(Integer id, Model model){
        User user = userService.selectUserById(id);
        model.addAttribute("updateUser",user);
        return "updateTeacher";
    }

    @ResponseBody
    @RequestMapping("/updateUser")
    public Object updateUser(User user){
        try {
            userService.updateUser(user);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    
    @ResponseBody
    @RequestMapping("/deleteUser")
    public Object deleteUser(Integer id){
        userService.deleteUser(id);
        return true;
    }

    @ResponseBody
    @RequestMapping("/accessReq")
    public Object accessReq(Integer userId){
        try{
            userService.accessReq(userId);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ResponseBody
    @RequestMapping("/refuseReq")
    public Object refuseReq(Integer userId){
        try {
            userService.refuseReq(userId);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
