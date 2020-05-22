package com.ggboy.item_bank.dao;

import com.ggboy.item_bank.beans.QstType;
import com.ggboy.item_bank.utils.GeneralMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface QstTypeDao extends GeneralMapper<QstType> {
    List<QstType> selectChoiceQst(@Param("teacherId") String teacherId, @Param("choiceType") String choiceType, @Param("start") Integer start, @Param("limit") Integer limit);

    int selectCountByTIdAndQstType(@Param("teacherId") String teacherId, @Param("qstType") String qstType);

    List<String> selectTestBySubject(@Param("subject") String subject,@Param("type") String type);

    String[] selectQstByLevelAndSubjectAndType(@Param("subject") String subject, @Param("level") Integer level, @Param("type") String type);
}
