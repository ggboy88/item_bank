package com.ggboy.item_bank.service;

import com.ggboy.item_bank.ItemBankApplication;
import com.ggboy.item_bank.beans.BigQst;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItemBankApplication.class)
public class TestServiceTest {

    @Resource
    private TestService testService;

    @Test
    public void deleteTest(){
        testService.deleteTest("20200504114146","应用题");
    }

}
