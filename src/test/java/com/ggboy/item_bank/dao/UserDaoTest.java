package com.ggboy.item_bank.dao;


import com.ggboy.item_bank.ItemBankApplication;
import com.ggboy.item_bank.beans.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItemBankApplication.class)
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void testSelect(){
        List<User> users = userDao.selectAll();
        System.err.println(users);
    }


    @Test
    public void testCheckPhoneNum(){
        User user = userDao.checkPhoneNum("zhangsan");
        System.err.println(user);
    }


}
