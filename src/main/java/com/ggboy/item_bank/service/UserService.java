package com.ggboy.item_bank.service;

import com.ggboy.item_bank.beans.User;

import java.util.List;


public interface UserService {

    void checkLogin(String username,String password) throws Exception;


    Boolean checkPhoneNum(String userTel);

    void addUser(User user);

    User isRegister(String username);

    List<User> selectUserListByFlag(String s);

    User selectUserById(Integer id);

    void updateUser(User user);

    void deleteUser(Integer id);

    void accessReq(Integer userId);

    void refuseReq(Integer userId);
}
