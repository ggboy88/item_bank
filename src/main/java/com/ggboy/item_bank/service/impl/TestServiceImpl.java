package com.ggboy.item_bank.service.impl;

import com.ggboy.item_bank.beans.*;
import com.ggboy.item_bank.dao.*;
import com.ggboy.item_bank.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private ChoiceQstDao choiceQstDao;

    @Resource
    private QstTypeDao qstTypeDao;

    @Resource
    private TOFQstDao tofQstDao;

    @Resource
    private DesignQstDao designQstDao;

    @Resource
    private BigQstDao bigQstDao;


    @Override
    public void addQstType(QstType qstType) {
        qstTypeDao.insert(qstType);
    }

    @Override
    public void addChoiceQst(ChoiceQst choiceQst) {
        choiceQstDao.insert(choiceQst);
    }

    @Override
    public void addTOFQst(TOFQst tofQst) {
        tofQstDao.insert(tofQst);
    }

    @Override
    public void addDesignQst(DesignQst designQst) {
        designQstDao.insert(designQst);
    }

    @Override
    public void addBigQst(BigQst bigQst) {
        bigQstDao.insert(bigQst);
    }

    @Override
    public List<ChoiceQst> selectChoiceTestList(String teacherId, int page, int limit) {
        int start = (page-1)*limit;
        String choiceType = "选择题";
        List<QstType> qstIds = qstTypeDao.selectChoiceQst(teacherId,choiceType,start,limit);
        List<ChoiceQst> choiceList = new ArrayList<>();
        for (int i = 0;i <= qstIds.size()-1;i++){
            ChoiceQst choiceQst = choiceQstDao.selectChoiceQstById(qstIds.get(i).getQuestionId());
            choiceList.add(choiceQst);
        }
        return choiceList;
    }

    @Override
    public int selectCountByTIdAndQstType(String teacherId, String qstType) {
        return qstTypeDao.selectCountByTIdAndQstType(teacherId,qstType);
    }

    @Override
    public List<TOFQst> selectTOFTestList(String teacherId, Integer page, Integer limit, String testType) {
        int start = (page-1)*limit;
        List<QstType> qstIds = qstTypeDao.selectChoiceQst(teacherId, testType, start, limit);
        List<TOFQst> TOFList = new ArrayList<>();
        for (int i = 0; i <= qstIds.size()-1; i++) {
            TOFQst tofQst = tofQstDao.selectTOFQstById(qstIds.get(i).getQuestionId());
                TOFList.add(tofQst);
        }
            return TOFList;
    }

    @Override
    public List<DesignQst> selectDesignTestList(String teacherId, Integer page, Integer limit, String testType) {
        int start = (page-1)*limit;
        List<QstType> qstIds = qstTypeDao.selectChoiceQst(teacherId, testType, start, limit);
        List<DesignQst> desList = new ArrayList<>();
        for (int i = 0; i <= qstIds.size()-1; i++) {
            DesignQst designQst = designQstDao.selectDesQstById(qstIds.get(i).getQuestionId());
            desList.add(designQst);
        }
        return desList;
    }

    @Override
    public List<BigQst> selectBigTestList(String teacherId, Integer page, Integer limit, String testType) {
        int start = (page-1)*limit;
        List<QstType> qstIds = qstTypeDao.selectChoiceQst(teacherId, testType, start, limit);
        List<BigQst> bigList = new ArrayList<>();
        for (int i = 0; i <= qstIds.size()-1; i++) {
            BigQst bigQst = bigQstDao.selectBigQstById(qstIds.get(i).getQuestionId());
            bigList.add(bigQst);
        }
        return bigList;
    }

    @Override
    public void deleteTest(String questionId,String testType) {
        QstType qstType = new QstType();
        qstType.setQuestionId(questionId);
        qstTypeDao.delete(qstType);
        if ("应用题".equals(testType)){
            BigQst bigQst = new BigQst();
            bigQst.setBigQuestion(questionId);
            bigQstDao.delete(bigQst);
        }else if ("简答题".equals(testType)){
            DesignQst designQst = new DesignQst();
            designQst.setDesignQuestion(questionId);
            designQstDao.delete(designQst);
        }else if ("判断题".equals(testType)){
            TOFQst tofQst = new TOFQst();
            tofQst.setTOFQuestion(questionId);
            tofQstDao.delete(tofQst);
        }else if ("选择题".equals(testType)){
            ChoiceQst choiceQst = new ChoiceQst();
            choiceQst.setChoiceQstQuestion(questionId);
            choiceQstDao.delete(choiceQst);
        }
    }

    @Override
    public List<ChoiceQst> selectChoiceTestBySubject(String subject) {
        List<String> tests = qstTypeDao.selectTestBySubject(subject,"选择题");
        ArrayList<ChoiceQst> choices = new ArrayList<>();
        for (String i :
                tests) {
            ChoiceQst choiceQst = choiceQstDao.selectChoiceQstById(i);
            choices.add(choiceQst);
        }
        return choices;
    }

    @Override
    public List<TOFQst> selectTOFTestBySubject(String subject) {
        List<String> list = qstTypeDao.selectTestBySubject(subject, "判断题");
        ArrayList<TOFQst> tofQsts = new ArrayList<>();
        for (String i :
                list) {
            TOFQst tofQst = tofQstDao.selectTOFQstById(i);
            tofQsts.add(tofQst);
        }
        return tofQsts;
    }

    @Override
    public List<DesignQst> selectDesignTestBySubject(String subject) {
        List<String> list = qstTypeDao.selectTestBySubject(subject, "简答题");
        ArrayList<DesignQst> designQsts = new ArrayList<>();
        for (String i :
                list) {
            DesignQst designQst = designQstDao.selectDesQstById(i);
            designQsts.add(designQst);
        }
        return designQsts;
    }

    @Override
    public List<BigQst> selectBigTestBySubject(String subject) {
        List<String> list = qstTypeDao.selectTestBySubject(subject, "应用题");
        ArrayList<BigQst> bigQsts = new ArrayList<>();
        for (String i :
                list) {
            BigQst bigQst = bigQstDao.selectBigQstById(i);
            bigQsts.add(bigQst);
        }
        return bigQsts;
    }

    @Override
    public ChoiceQst selectChoiceById(String str) {
        return choiceQstDao.selectChoiceQstById1(str);
    }

    @Override
    public List<ChoiceQst> selectChoiceListById(String choiceTests) {
        String[] split = choiceTests.split(",");
        ArrayList<ChoiceQst> choiceQsts = new ArrayList<>();
        for (String i :
                split) {
            ChoiceQst choiceQst = choiceQstDao.selectChoiceQstById(i);
            choiceQsts.add(choiceQst);
        }
        return choiceQsts;
    }

    @Override
    public List<TOFQst> selectTOFListById(String tofTests) {
        String[] split = tofTests.split(",");
        ArrayList<TOFQst> tofQsts = new ArrayList<>();
        for (String i :
                split) {
            TOFQst tofQst = tofQstDao.selectTOFQstById(i);
            tofQsts.add(tofQst);
        }
        return tofQsts;
    }

    @Override
    public List<DesignQst> selectDesignListById(String designTests) {
        String[] split = designTests.split(",");
        ArrayList<DesignQst> designQsts = new ArrayList<>();
        for (String i :
                split) {
            DesignQst designQst = designQstDao.selectDesQstById(i);
            designQsts.add(designQst);
        }
        return designQsts;
    }

    @Override
    public List<BigQst> selectBigListById(String bigTests) {
        String[] split = bigTests.split(",");
        ArrayList<BigQst> bigQsts = new ArrayList<>();
        for (String i :
                split) {
            BigQst bigQst = bigQstDao.selectBigQstById(i);
            bigQsts.add(bigQst);
        }
        return bigQsts;
    }
}
