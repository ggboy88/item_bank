package com.ggboy.item_bank.controller;

import com.ggboy.item_bank.beans.*;
import com.ggboy.item_bank.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PageController {

    @Resource
    private SpecialtyService specialtyService;
    @Resource
    private UserService userService;
    @Resource
    private TestService testService;

    @Resource
    private SubjectService subjectService;

    @Resource
    private PaperService paperService;

    @RequestMapping("/")
    public String login(){
        return "login";
    }

    @RequestMapping("/register")
    public String register(Model model){
        List<Specialty> list = specialtyService.listSpecialty();
        model.addAttribute("Specialties",list);
        return "register";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.setAttribute("user",null);
        return "login";
    }

    @RequestMapping("/forgot")
    public String forgot(){
        return "forgot";
    }

    @RequestMapping("/toAddTest")
    public String toAddTest(){
        return "addTest";
    }

    @RequestMapping("/toAddChoiceQst")
    public String toAddChoiceQst(HttpSession session,Model model){
        User user = (User) session.getAttribute("user");
        List<Subject> subjects = subjectService.selectSubjectByUserTelAndSId(user.getUsername(), user.getTeacherSpecialty());
        model.addAttribute("subjects",subjects);
        return "addChoiceQst";
    }

    @RequestMapping("/toAddTOFQst")
    public String toAddTOFQst(HttpSession session,Model model){
        User user = (User) session.getAttribute("user");
        List<Subject> subjects = subjectService.selectSubjectByUserTelAndSId(user.getUsername(), user.getTeacherSpecialty());
        model.addAttribute("subjects",subjects);
        return "addTOFQst";
    }

    @RequestMapping("/toDesignQst")
    public String toDesignQst(HttpSession session,Model model){
        User user = (User) session.getAttribute("user");
        List<Subject> subjects = subjectService.selectSubjectByUserTelAndSId(user.getUsername(), user.getTeacherSpecialty());
        model.addAttribute("subjects",subjects);
        return "addDesignQst";
    }

    @RequestMapping("/toBigQst")
    public String toBigQst(HttpSession session,Model model){
        User user = (User) session.getAttribute("user");
        List<Subject> subjects = subjectService.selectSubjectByUserTelAndSId(user.getUsername(), user.getTeacherSpecialty());
        model.addAttribute("subjects",subjects);
        return "addBigQst";
    }
    @RequestMapping("/toTestList")
    public String toTestList(){
        return "testList";
    }

    @RequestMapping("/toTestPage")
    public String toTestPage(String testType,Model model,HttpSession session){
        if ("选择题".equals(testType)){
            return "choiceList";
        }else if ("判断题".equals(testType)){
            return "TOFList";
        }else if ("简答题".equals(testType)){
            return "designList";
        }else if ("应用题".equals(testType)){
            return "bigList";
        }else {
            return "testList";
        }
    }

    @RequestMapping("/toSpecialtyList")
    public String toSpecialtyList(Model model){
        List<Specialty> specialties = specialtyService.selectAll();
        model.addAttribute("specialties",specialties);
        return "specialtyList";
    }

    @RequestMapping("/toSpecialtyDetail")
    public String toSpecialtyDetail(Integer specialtyId,Model model){
        try {
            List<Subject> subjectList = subjectService.selectSubBySpecialtyId(specialtyId);
            model.addAttribute("subjectList",subjectList);
            String spName = specialtyService.selectSpNameById1(specialtyId);
            model.addAttribute("spName",spName);
            String subId = subjectService.selectLastId();
            model.addAttribute("subId",subId);
            return "specialtyDetails";
        }catch (Exception e){
            return "specialtyDetails";
        }

    }

    @ResponseBody
    @RequestMapping("/deleteSpecialty")
    public Object deleteSpecialty(Integer specialtyId){
        System.err.println(specialtyId);
        subjectService.deleteSubBySpecialtyId(specialtyId);
        return true;
    }

    @ResponseBody
    @RequestMapping("/updateSp")
    public Object updateSp(String specialtyName){
        specialtyService.update(specialtyName);
        return true;
    }

    @ResponseBody
    @RequestMapping("/deleteSub")
    public Object deleteSub(String courseId){
        subjectService.deleteSubByCourseId(courseId);
        return true;
    }

    @ResponseBody
    @RequestMapping("/updateSub")
    public Object updateSub(Subject subject){
        subjectService.addSub(subject);
        return true;
    }

    @RequestMapping("/toTeacherList")
    public String toTeacherList(Model model){
        List<User> users = userService.selectUserListByFlag("1");
        model.addAttribute("users",users);
        return "teacherList";
    }

    @RequestMapping("/toRequestPage")
    public String toRequestPage(Model model){
        List<User> users = userService.selectUserListByFlag("0");
        ArrayList<User> userList = new ArrayList<>();
        List<Specialty> specialties = specialtyService.selectAll();
        for (User user :
                users) {
            for (Specialty specialty :
                    specialties) {
                if (user.getTeacherSpecialty().equals(specialty.getSpecialtyId().toString())){
                    user.setTeacherSpecialty(specialty.getSpecialtyName());
                    userList.add(user);
                }
            }
        }
        model.addAttribute("users",userList);
        return "registReqPage";
    }

    @RequestMapping("/toManually")
    public String toManually(HttpSession session,Model model){
        User user = (User) session.getAttribute("user");
        String teacherSpecialty = user.getTeacherSpecialty();
        int i = Integer.parseInt(teacherSpecialty);
        List<Subject> subjectList = subjectService.selectSubBySpecialtyId(i);
        model.addAttribute("subjectList",subjectList);
        return "manuallyPaper";
    }

    @RequestMapping("/toManuallyPaper1")
    public String toManuallyPaper1(){
        return "manuallyPaper1";
    }

    @RequestMapping("/toCapacity")
    public String toCapacity(Model model,HttpSession session){
        User user = (User) session.getAttribute("user");
        String teacherSpecialty = user.getTeacherSpecialty();
        int i = Integer.parseInt(teacherSpecialty);
        List<Subject> subjectList = subjectService.selectSubBySpecialtyId(i);
        model.addAttribute("subjectList",subjectList);
        return "capacityPaper";
    }

    @RequestMapping("/toPaperList")
    public String toPaperList(HttpSession session,Model model){
        User user = (User) session.getAttribute("user");
        List<Paper> papers = paperService.selectPaperByUserId(user.getId());
        model.addAttribute("papers",papers);
        return "paperList";
    }



}
