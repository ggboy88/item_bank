package com.ggboy.item_bank.dao;


import com.ggboy.item_bank.ItemBankApplication;
import com.ggboy.item_bank.beans.Specialty;
import com.ggboy.item_bank.beans.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItemBankApplication.class)
public class SubjectDaoTest {

    @Resource
    private SubjectDao subjectDao;

    @Test
    public void selectSubjectByUserTelAndSId(){
        List<Subject> subjects = subjectDao.selectSubjectByUserTelAndSId("18080259326", "1");
        System.err.println(subjects);
    }
}
