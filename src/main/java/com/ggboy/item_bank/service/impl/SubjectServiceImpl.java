package com.ggboy.item_bank.service.impl;

import com.ggboy.item_bank.beans.Specialty;
import com.ggboy.item_bank.beans.Subject;
import com.ggboy.item_bank.dao.SpecialtyDao;
import com.ggboy.item_bank.dao.SubjectDao;
import com.ggboy.item_bank.service.SubjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService {

    @Resource
    private SubjectDao subjectDao;

    @Resource
    private SpecialtyDao specialtyDao;

    @Override
    public List<Subject> selectSubjectByUserTelAndSId(String userTel,String userSp) {
        return subjectDao.selectSubjectByUserTelAndSId(userTel,userSp);
    }

    @Override
    public List<Subject> selectSubBySpecialtyId(Integer specialtyId) {
        return subjectDao.selectSubBySpecialtyId(specialtyId);
    }

    @Override
    public void deleteSubBySpecialtyId(Integer specialtyId) {
        Subject subject = new Subject();
        subject.setCourseSpecialty(specialtyId);
        subjectDao.delete(subject);
        Specialty specialty = new Specialty();
        specialty.setSpecialtyId(specialtyId);
        specialtyDao.delete(specialty);
    }

    @Override
    public void deleteSubByCourseId(String courseId) {
        Subject subject = new Subject();
        subject.setCourseId(courseId);
        subjectDao.delete(subject);
    }

    @Override
    public void addSub(Subject subject) {
        subjectDao.insert(subject);
    }

    @Override
    public String selectSubNameById(String paperCourse) {
        return subjectDao.selectSubNameById(paperCourse);
    }

    @Override
    public String selectLastId() {
        return subjectDao.selectLastId();
    }
}
