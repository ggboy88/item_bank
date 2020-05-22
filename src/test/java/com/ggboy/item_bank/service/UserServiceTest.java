package com.ggboy.item_bank.service;


import com.ggboy.item_bank.ItemBankApplication;
import com.ggboy.item_bank.beans.User;
import com.ggboy.item_bank.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItemBankApplication.class)
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void checkPhoneNum(){
        Boolean b = userService.checkPhoneNum("zhangsan");
        System.err.println(b);
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setTeacherSpecialty("理学院");
        user.setTeacherName("刘芒");
        user.setUsername("15182420845");
        user.setPassword("123456");
        System.err.println(user);
        userService.addUser(user);
        System.err.println(user);
    }

}
