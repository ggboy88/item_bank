package com.ggboy.item_bank.dao;

import com.ggboy.item_bank.ItemBankApplication;
import com.ggboy.item_bank.beans.Paper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItemBankApplication.class)
public class PaperDaoTest {

    @Resource
    private PaperDao paperDao;

    @Test
    public void addPaper(){
        paperDao.insert(new Paper("1001","2020/05/12 10:55:21",
                1,"8","10,11","10,11","8,9,10"));
    }

    @Test
    public void selectPaperByUserId(){
        List<Paper> papers = paperDao.selectPaperByUserId(4);
        System.err.println(papers);
    }

}
