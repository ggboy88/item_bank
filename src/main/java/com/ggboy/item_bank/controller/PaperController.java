package com.ggboy.item_bank.controller;

import com.alibaba.fastjson.JSONObject;
import com.ggboy.item_bank.beans.*;
import com.ggboy.item_bank.service.PaperService;
import com.ggboy.item_bank.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/paper")
public class PaperController {

    @Resource
    private TestService testService;

    @Resource
    private PaperService paperService;

    @RequestMapping("/manuallyPaper")
    public String manuallyPaper(String subject, HttpSession session){
        session.setAttribute("subject",subject);
        return "manuallyPaper1";
    }
    @RequestMapping("/listAndChoiceTest")
    public String listAndChoiceTest(String type, HttpSession session, Model model){
        String subject = (String) session.getAttribute("subject");
        if ("选择题".equals(type)){
            List<ChoiceQst> choiceQsts = testService.selectChoiceTestBySubject(subject);
            model.addAttribute("choiceQsts",choiceQsts);
            return "listChoice";
        }else if ("判断题".equals(type)){
            List<TOFQst> tofQsts = testService.selectTOFTestBySubject(subject);
            model.addAttribute("tofQsts",tofQsts);
            return "listTOF";
        }else if ("简答题".equals(type)){
            List<DesignQst> designQsts = testService.selectDesignTestBySubject(subject);
            model.addAttribute("designQsts",designQsts);
            return "listDesign";
        }else{
            List<BigQst> bigQsts = testService.selectBigTestBySubject(subject);
            model.addAttribute("bigQsts",bigQsts);
            return "listBig";
        }
    }

    @ResponseBody
    @RequestMapping("/updateBigTest")
    public Object updateTest(String tests, HttpSession session){
        session.setAttribute("bigTests",tests);
        return "添加成功";
    }

    @ResponseBody
    @RequestMapping("/updateChoiceTest")
    public Object updateChoiceTest(String tests, HttpSession session){
        session.setAttribute("choiceTests",tests);
        return "添加成功";
    }

    @ResponseBody
    @RequestMapping("/updateDesignTest")
    public Object updateDesignTest(String tests, HttpSession session){
        session.setAttribute("designTests",tests);
        return "添加成功";
    }

    @ResponseBody
    @RequestMapping("/updateTOFTest")
    public Object updateTOFTest(String tests, HttpSession session){
        session.setAttribute("tofTests",tests);
        return "添加成功";
    }

    @ResponseBody
    @RequestMapping("/updatePaper")
    public Object updatePaper(String msg,HttpSession session){
        String choiceTests = (String) session.getAttribute("choiceTests");
        String tofTests = (String) session.getAttribute("tofTests");
        String designTests = (String) session.getAttribute("designTests");
        String bigTests = (String) session.getAttribute("bigTests");
        if (choiceTests == null || tofTests ==null || designTests ==null || bigTests == null){
            return false;
        }else {
            String subject = (String) session.getAttribute("subject");
            User user = (User) session.getAttribute("user");
            Date now = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String format = simpleDateFormat.format(now);
            Paper paper = new Paper(subject, format, user.getId(), choiceTests, tofTests, designTests, bigTests,"自定义");
            paperService.addPaper(paper);
            return true;
        }
    }

    @RequestMapping("/listPaper")
    public String listPaper(HttpSession session,Model model){
        String choiceTests = (String) session.getAttribute("choiceTests");
        String tofTests = (String) session.getAttribute("tofTests");
        String designTests = (String) session.getAttribute("designTests");
        String bigTests = (String) session.getAttribute("bigTests");
        List<ChoiceQst> choiceQsts = testService.selectChoiceListById(choiceTests);
        List<TOFQst> tofQsts = testService.selectTOFListById(tofTests);
        List<DesignQst> designQsts = testService.selectDesignListById(designTests);
        List<BigQst> bigQsts = testService.selectBigListById(bigTests);
        model.addAttribute("choiceQsts",choiceQsts);
        model.addAttribute("tofQsts",tofQsts);
        model.addAttribute("designQsts",designQsts);
        model.addAttribute("bigQsts",bigQsts);
        return "createPaper";
    }

    @RequestMapping("/capacityPaper")
    public String capacityPaper(String subject,Integer choiceCount,Integer tofCount,
                                Integer designCount,Integer bigCount,Integer level,HttpSession session,Model model){
        try {
            User user = (User) session.getAttribute("user");
            Paper paper = paperService.capacity(subject,choiceCount,tofCount,designCount,bigCount,level,user.getId());
            session.setAttribute("paper",paper);
            List<ChoiceQst> choiceQsts = testService.selectChoiceListById(paper.getPaperChoiceInfo());
            List<TOFQst> tofQsts = testService.selectTOFListById(paper.getPaperTOFInfo());
            List<DesignQst> designQsts = testService.selectDesignListById(paper.getPaperDesignInfo());
            List<BigQst> bigQsts = testService.selectBigListById(paper.getPaperBigInfo());
            model.addAttribute("choiceQsts",choiceQsts);
            model.addAttribute("tofQsts",tofQsts);
            model.addAttribute("designQsts",designQsts);
            model.addAttribute("bigQsts",bigQsts);
            return "capacityPaper1";
        }catch (Exception e){
            model.addAttribute("msg","试题数量不足，请修改试题数量");
            return "capacityPaper";
        }

    }

    @ResponseBody
    @RequestMapping("/updateCapacityPaper")
    public Object updateCapacityPaper(String msg,HttpSession session){
        Paper paper = (Paper) session.getAttribute("paper");
        try{
            paperService.addPaper(paper);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    @RequestMapping("/selectPaperById")
    public String selectPaperById(Integer paperId,Model model){
        Paper paper = paperService.selectPaperById(paperId);
        List<ChoiceQst> choiceQsts = testService.selectChoiceListById(paper.getPaperChoiceInfo());
        List<TOFQst> tofQsts = testService.selectTOFListById(paper.getPaperTOFInfo());
        List<DesignQst> designQsts = testService.selectDesignListById(paper.getPaperDesignInfo());
        List<BigQst> bigQsts = testService.selectBigListById(paper.getPaperBigInfo());
        model.addAttribute("choiceQsts",choiceQsts);
        model.addAttribute("tofQsts",tofQsts);
        model.addAttribute("designQsts",designQsts);
        model.addAttribute("bigQsts",bigQsts);
        return "paperDetails";
    }

    @ResponseBody
    @RequestMapping("/deletePaperById")
    public Object deletePaperById(Integer paperId){
        try {
            paperService.deletePaperById(paperId);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
