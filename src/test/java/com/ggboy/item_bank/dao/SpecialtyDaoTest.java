package com.ggboy.item_bank.dao;


import com.ggboy.item_bank.ItemBankApplication;
import com.ggboy.item_bank.beans.Specialty;
import com.ggboy.item_bank.beans.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItemBankApplication.class)
public class SpecialtyDaoTest {

    @Resource
    private SpecialtyDao specialtyDao;

    @Test
    public void selectAll(){
        List<Specialty> specialties = specialtyDao.selectAll();
        System.err.println(specialties);
    }

    @Test
    public void selectSpecialtyIdBySpecialtyName(){
        String i = specialtyDao.selectSpecialtyIdBySpecialtyName("理学院");
        System.err.println(i);
    }

}
