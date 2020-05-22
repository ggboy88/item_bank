package com.ggboy.item_bank.dao;

import com.ggboy.item_bank.ItemBankApplication;
import com.ggboy.item_bank.beans.ChoiceQst;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItemBankApplication.class)
public class ChoiceQstDaoTest {

    @Resource
    private ChoiceQstDao choiceQstDao;

    @Test
    public void testSelectChoiceQstById(){
        ChoiceQst choiceQst = choiceQstDao.selectChoiceQstById("20200429192805");
        System.err.println(choiceQst);
    }

    @Test
    public void selectChoiceQstById1(){
        ChoiceQst choiceQst = choiceQstDao.selectChoiceQstById1("10");
        System.err.println(choiceQst);
    }

}
