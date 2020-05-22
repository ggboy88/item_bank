package com.ggboy.item_bank.service;

import com.ggboy.item_bank.beans.Subject;

import java.util.List;

public interface SubjectService {

    List<Subject> selectSubjectByUserTelAndSId(String userTel,String UserSp);

    List<Subject> selectSubBySpecialtyId(Integer specialtyId);

    void deleteSubBySpecialtyId(Integer specialtyId);

    void deleteSubByCourseId(String courseId);

    void addSub(Subject subject);

    String selectSubNameById(String paperCourse);

    String selectLastId();

}
