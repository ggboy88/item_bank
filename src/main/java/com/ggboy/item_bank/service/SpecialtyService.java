package com.ggboy.item_bank.service;

import com.ggboy.item_bank.beans.Specialty;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SpecialtyService {

    List<Specialty> listSpecialty();

    String selectSpNameById(String id);

    List<Specialty> selectAll();

    void update(String specialtyName);

    String selectSpNameById1(Integer specialtyId);
}
