package com.ggboy.item_bank.dao;

import com.ggboy.item_bank.beans.DesignQst;
import com.ggboy.item_bank.utils.GeneralMapper;

public interface DesignQstDao extends GeneralMapper<DesignQst> {
    DesignQst selectDesQstById(String questionId);

    DesignQst selectTOFQstById1(String i);
}
