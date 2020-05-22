package com.ggboy.item_bank.dao;

import com.ggboy.item_bank.beans.TOFQst;
import com.ggboy.item_bank.utils.GeneralMapper;

public interface TOFQstDao extends GeneralMapper<TOFQst> {
    TOFQst selectTOFQstById(String questionId);

    TOFQst selectTOFQstById1(String i);
}
