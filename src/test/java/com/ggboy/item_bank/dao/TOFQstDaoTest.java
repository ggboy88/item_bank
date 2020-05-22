package com.ggboy.item_bank.dao;

import com.ggboy.item_bank.ItemBankApplication;
import com.ggboy.item_bank.beans.ChoiceQst;
import com.ggboy.item_bank.beans.TOFQst;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItemBankApplication.class)
public class TOFQstDaoTest {

    @Resource
    private TOFQstDao tofQstDao;

    @Test
    public void testSelectChoiceQstById(){
        TOFQst choiceQst = tofQstDao.selectTOFQstById("20200429201329");
        System.err.println(choiceQst);
    }

}
