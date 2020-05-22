package com.ggboy.item_bank.dao;

import com.ggboy.item_bank.beans.BigQst;
import com.ggboy.item_bank.utils.GeneralMapper;

public interface BigQstDao extends GeneralMapper<BigQst> {
    BigQst selectBigQstById(String questionId);

    BigQst selectTOFQstById1(String i);
}
