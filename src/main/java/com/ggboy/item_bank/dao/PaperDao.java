package com.ggboy.item_bank.dao;

import com.ggboy.item_bank.beans.Paper;
import com.ggboy.item_bank.utils.GeneralMapper;

import java.util.List;

public interface PaperDao extends GeneralMapper<Paper> {
    List<Paper> selectPaperByUserId(Integer id);

    Paper selectPaperById(Integer paperId);
}
