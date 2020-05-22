package com.ggboy.item_bank.dao;

import com.ggboy.item_bank.beans.Specialty;
import com.ggboy.item_bank.utils.GeneralMapper;

public interface SpecialtyDao extends GeneralMapper<Specialty> {
    String selectSpecialtyIdBySpecialtyName(String t);

    String selectSpNameById(String id);

    String selectSpNameById1(Integer specialtyId);
}
