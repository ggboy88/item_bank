package com.ggboy.item_bank.service;

import com.ggboy.item_bank.beans.*;

import java.util.List;

public interface TestService {


    void addQstType(QstType qstType);

    void addChoiceQst(ChoiceQst choiceQst);

    void addTOFQst(TOFQst tofQst);

    void addDesignQst(DesignQst designQst);

    void addBigQst(BigQst bigQst);

    List<ChoiceQst> selectChoiceTestList(String teacherId,int page,int limit);

    int selectCountByTIdAndQstType(String teacherId,String qstType);

    List<TOFQst> selectTOFTestList(String teacherId, Integer page, Integer limit, String testType);

    List<DesignQst> selectDesignTestList(String teacherId, Integer page, Integer limit, String testType);

    List<BigQst> selectBigTestList(String teacherId, Integer page, Integer limit, String testType);

    void deleteTest(String bigQuestion,String testType);

    List<ChoiceQst> selectChoiceTestBySubject(String subject);

    List<TOFQst> selectTOFTestBySubject(String subject);

    List<DesignQst> selectDesignTestBySubject(String subject);

    List<BigQst> selectBigTestBySubject(String subject);

    ChoiceQst selectChoiceById(String str);

    List<ChoiceQst> selectChoiceListById(String choiceTests);

    List<TOFQst> selectTOFListById(String tofTests);

    List<DesignQst> selectDesignListById(String designTests);

    List<BigQst> selectBigListById(String bigTests);
}
