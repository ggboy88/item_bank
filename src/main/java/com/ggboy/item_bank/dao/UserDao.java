package com.ggboy.item_bank.dao;

import com.ggboy.item_bank.beans.User;
import com.ggboy.item_bank.utils.GeneralMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserDao extends GeneralMapper<User> {


    User checkPhoneNum(String userTel);

    List<User> selectUserListByFlag(String s);

    User selectUserById(Integer id);

    void updateUser(@Param("id") Integer id,@Param("teacherName") String teacherName,@Param("username") String username,@Param("password") String password);

    void deleteUser(Integer id);

    void accessReq(Integer userId);
}
