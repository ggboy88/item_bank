package com.ggboy.item_bank.controller;

import com.ggboy.item_bank.beans.*;
import com.ggboy.item_bank.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;

    @ResponseBody
    @RequestMapping("/choiceType")
    public Object choiceType(String msg){
        return msg;
    }

    @RequestMapping("/addChoiceQst")
    public String addChoiceQst(QstType qstType, ChoiceQst choiceQst, HttpSession session,Model model){
        qstType.setQuestionName("选择题");
        if (qstType.getQuestionCourse().equals("请选择科目")||qstType.getQuestionLevel().equals("请选择试题难度")){
            model.addAttribute("wrongMsg1","试题信息错误！");
            return "addChoiceQst";
        }else if (choiceQst.getChoiceQstInfo().equals("")||choiceQst.getChoiceQstOp1()
                .equals("")||choiceQst.getChoiceQstOp2().equals("")||choiceQst.getChoiceQstOp3()
                .equals("")||choiceQst.getChoiceQstOp4().equals("")||choiceQst.getChoiceQstAnsw().equals("")){
            model.addAttribute("wrongMsg2","试题内容错误！");
            return "addChoiceQst";
        }else {
            User user = (User) session.getAttribute("user");
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            String dateString = format.format(date);
            qstType.setQuestionId(dateString);
            qstType.setQuestionTeacher(user.getTeacherId());
            testService.addQstType(qstType);
            choiceQst.setChoiceQstQuestion(dateString);
            testService.addChoiceQst(choiceQst);
            model.addAttribute("successMsg","添加成功！");
            return "addChoiceQst";
        }
    }
    @RequestMapping("/addTOFQst")
    public String addTOFQst(QstType qstType, TOFQst tofQst, HttpSession session, Model model){
        qstType.setQuestionName("判断题");
        if (qstType.getQuestionCourse().equals("请选择科目")||qstType.getQuestionLevel().equals("请选择试题难度")){
            model.addAttribute("wrongMsg1","试题信息错误！");
            return "addTOFQst";
        }else if (tofQst.getTOFInfo().equals("")||tofQst.getTOFAnsw().equals("")){
            model.addAttribute("wrongMsg2","试题内容错误！");
            return "addTOFQst";
        }else {
            User user = (User) session.getAttribute("user");
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            String dateString = format.format(date);
            qstType.setQuestionId(dateString);
            qstType.setQuestionTeacher(user.getTeacherId());
            testService.addQstType(qstType);
            tofQst.setTOFQuestion(dateString);
            testService.addTOFQst(tofQst);
            model.addAttribute("successMsg","添加成功！");
            return "addTOFQst";
        }
    }

    @RequestMapping("/addDesignQst")
    public String addDesignQst(QstType qstType, DesignQst designQst, HttpSession session, Model model){
        qstType.setQuestionName("简答题");
        if (qstType.getQuestionCourse().equals("请选择科目")||qstType.getQuestionLevel().equals("请选择试题难度")){
            model.addAttribute("wrongMsg1","试题信息错误！");
            return "addDesignQst";
        }else if (designQst.getDesignInfo().equals("") || designQst.getDesignAnsw().equals("")){
            model.addAttribute("wrongMsg2","试题内容错误！");
            return "addDesignQst";
        }else {
            User user = (User) session.getAttribute("user");
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            String dateString = format.format(date);
            qstType.setQuestionId(dateString);
            qstType.setQuestionTeacher(user.getTeacherId());
            testService.addQstType(qstType);
            designQst.setDesignQuestion(dateString);
            testService.addDesignQst(designQst);
            model.addAttribute("successMsg","添加成功！");
            return "addDesignQst";
        }
    }

    @RequestMapping("/addBigQst")
    public String addBigQst(QstType qstType, BigQst bigQst, HttpSession session, Model model){
        qstType.setQuestionName("应用题");
        if (qstType.getQuestionCourse().equals("请选择科目")||qstType.getQuestionLevel().equals("请选择试题难度")){
            model.addAttribute("wrongMsg1","试题信息错误！");
            return "addBigQst";
        }else if (bigQst.getBigInfo().equals("")||bigQst.getBigAnsw().equals("")){
            model.addAttribute("wrongMsg2","试题内容错误！");
            return "addBigQst";
        }else {
            User user = (User) session.getAttribute("user");
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            String dateString = format.format(date);
            qstType.setQuestionId(dateString);
            qstType.setQuestionTeacher(user.getTeacherId());
            testService.addQstType(qstType);
            bigQst.setBigQuestion(dateString);
            testService.addBigQst(bigQst);
            model.addAttribute("successMsg","添加成功！");
            return "addBigQst";
        }
    }

    @ResponseBody
    @RequestMapping("/choiceList")
    public Map<String,Object> choiceList(Integer page,Integer limit,HttpSession session){
        User user = (User) session.getAttribute("user");
        String teacherId = user.getTeacherId();
        List<ChoiceQst> choiceList = testService.selectChoiceTestList(teacherId,page,limit);
        int count = testService.selectCountByTIdAndQstType(teacherId, "选择题");
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","选择题列表");
        map.put("count",count);
        map.put("choiceList",choiceList);
        return map;
    }

    @ResponseBody
    @RequestMapping("/TOFList")
    public Object TOFList(Integer page,Integer limit,HttpSession session){
        String testType = "判断题";
        User user = (User) session.getAttribute("user");
        String teacherId = user.getTeacherId();
        List<TOFQst> TOFList = testService.selectTOFTestList(teacherId,page,limit,testType);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","判断题列表");
        map.put("TOFList",TOFList);
        return map;
    }

    @ResponseBody
    @RequestMapping("/DesignList")
    public Map<String,Object> designList(Integer page,Integer limit,HttpSession session){
        String testType = "简答题";
        User user = (User) session.getAttribute("user");
        String teacherId = user.getTeacherId();
        List<DesignQst> DesList = testService.selectDesignTestList(teacherId,page,limit,testType);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","简答题列表");
        map.put("DesList",DesList);
        return map;
    }

    @ResponseBody
    @RequestMapping("/BigList")
    public Map<String,Object> bigList(Integer page,Integer limit,HttpSession session){
        String testType = "应用题";
        User user = (User) session.getAttribute("user");
        String teacherId = user.getTeacherId();
        List<BigQst> bigList = testService.selectBigTestList(teacherId,page,limit,testType);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","应用题列表");
        map.put("bigList",bigList);
        return map;
    }

    @ResponseBody
    @RequestMapping("/updateBigTest")
    public Object updateBigTest(BigQst bigQst){
        System.err.println(bigQst);
        return true;
    }

    @ResponseBody
    @RequestMapping("/deleteBigTest")
    public Object deleteBigTest(String bigQuestion){
        String testType = "应用题";
        testService.deleteTest(bigQuestion,testType);
        return true;
    }

    @ResponseBody
    @RequestMapping("/deleteTOFTest")
    public Object deleteTOFTest(String tofquestion){
        String testType = "判断题";
        testService.deleteTest(tofquestion,testType);
        return true;
    }

    @ResponseBody
    @RequestMapping("/deleteDesTest")
    public Object deleteDesTest(String tofquestion){
        String testType = "简答题";
        testService.deleteTest(tofquestion,testType);
        return true;
    }

    @ResponseBody
    @RequestMapping("/deleteChoiceTest")
    public Object deleteChoiceTest(String choiceQstQuestion){
        String testType = "选择题";
        testService.deleteTest(choiceQstQuestion,testType);
        return true;
    }
}
