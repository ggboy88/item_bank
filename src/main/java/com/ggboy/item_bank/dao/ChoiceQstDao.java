package com.ggboy.item_bank.dao;

import com.ggboy.item_bank.beans.ChoiceQst;
import com.ggboy.item_bank.utils.GeneralMapper;

public interface ChoiceQstDao extends GeneralMapper<ChoiceQst> {
    ChoiceQst selectChoiceQstById(String s);

    ChoiceQst selectChoiceQstById1(String str);
}
