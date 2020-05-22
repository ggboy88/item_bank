package com.ggboy.item_bank.service;

import com.ggboy.item_bank.ItemBankApplication;
import com.ggboy.item_bank.beans.Paper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItemBankApplication.class)
public class PaperServiceTest {


    @Resource
    private PaperService paperService;

    @Test
    public void capacity(){
        Paper capacity = paperService.capacity("1001", 4, 3, 3, 2, 5, 1);
        System.err.println(capacity);
        paperService.addPaper(capacity);
    }

}
