package com.ggboy.item_bank.dao;

import com.ggboy.item_bank.beans.Subject;
import com.ggboy.item_bank.utils.GeneralMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubjectDao extends GeneralMapper<Subject> {

    List<Subject> selectSubjectByUserTelAndSId(@Param("userTel") String userTel,@Param("userSp") String userSp);

    List<Subject> selectSubBySpecialtyId(Integer specialtyId);

    String selectSubNameById(String paperCourse);

    String selectLastId();
}
