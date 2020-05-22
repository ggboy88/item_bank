package com.ggboy.item_bank.service;

import com.ggboy.item_bank.beans.Paper;

import java.util.List;

public interface PaperService {

    public void addPaper(Paper paper);

    Paper capacity(String subject, Integer choiceCount, Integer tofCount, Integer designCount, Integer bigCount, Integer level,Integer teacherId);

    List<Paper> selectPaperByUserId(Integer id);

    Paper selectPaperById(Integer paperId);

    void deletePaperById(Integer paperId);
}
