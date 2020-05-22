package com.ggboy.item_bank.dao;

import com.ggboy.item_bank.ItemBankApplication;
import com.ggboy.item_bank.beans.QstType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItemBankApplication.class)
public class QstTypeDaoTest {

    @Resource
    private QstTypeDao qstTypeDao;

    @Test
    public void TestSelectChoiceQst(){
        List<QstType> list = qstTypeDao.selectChoiceQst("1", "简答题",0,10);

        for (QstType l :
                list) {
            System.err.println(l);
        }
    }

    @Test
    public void selectTestBySubject(){
        List<String> list = qstTypeDao.selectTestBySubject("1001","选择题");
        System.err.println(list);
    }

    @Test
    public void selectQstByLevelAndSubjectAndType(){
        String[] list = qstTypeDao.selectQstByLevelAndSubjectAndType("1001", 5, "选择题");
        for (String i :
                list) {
            System.err.println(i);
        }
    }

}
