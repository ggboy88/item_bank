package com.ggboy.item_bank.service.impl;

import com.ggboy.item_bank.beans.Specialty;
import com.ggboy.item_bank.beans.Subject;
import com.ggboy.item_bank.dao.SpecialtyDao;
import com.ggboy.item_bank.dao.SubjectDao;
import com.ggboy.item_bank.service.SpecialtyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SpecialtyServiceImpl implements SpecialtyService {

    @Resource
    SpecialtyDao specialtyDao;

    @Resource
    private SubjectDao subjectDao;

    @Override
    public List<Specialty> listSpecialty() {
        return specialtyDao.selectAll();
    }

    @Override
    public String selectSpNameById(String id) {
        return specialtyDao.selectSpNameById(id);
    }

    @Override
    public List<Specialty> selectAll() {
        return specialtyDao.selectAll();
    }

    @Override
    public void update(String specialtyName) {
        Specialty specialty = new Specialty();
        specialty.setSpecialtyName(specialtyName);
        specialtyDao.insert(specialty);
        String s = specialtyDao.selectSpecialtyIdBySpecialtyName(specialtyName);
        Subject subject = new Subject("0","默认，请添加科目后删除",Integer.parseInt(s));
        subjectDao.insert(subject);
    }

    @Override
    public String selectSpNameById1(Integer specialtyId) {
        return specialtyDao.selectSpNameById1(specialtyId);
    }

}
