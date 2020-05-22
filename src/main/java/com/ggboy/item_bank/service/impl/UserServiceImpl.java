package com.ggboy.item_bank.service.impl;

import com.ggboy.item_bank.beans.Specialty;
import com.ggboy.item_bank.beans.User;
import com.ggboy.item_bank.beans.UserRoles;
import com.ggboy.item_bank.dao.SpecialtyDao;
import com.ggboy.item_bank.dao.UserDao;
import com.ggboy.item_bank.dao.UserRolesDao;
import com.ggboy.item_bank.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.validation.constraints.Pattern;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Resource
    private SpecialtyDao specialtyDao;
    @Resource
    private UserRolesDao userRolesDao;

    @Override
    public void checkLogin(String username, String password) throws Exception {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        subject.login(token);
    }

    @Override
    public Boolean checkPhoneNum(String userTel) {
        User user = userDao.checkPhoneNum(userTel);
        if (user != null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void addUser(User user) {
        String t = user.getTeacherSpecialty();
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = format.format(date);
        user.setTeacherId(dateString);
        String i = specialtyDao.selectSpecialtyIdBySpecialtyName(t);
        user.setTeacherSpecialty(i);
        user.setFlag(0);
        userDao.insert(user);
        UserRoles userRoles = new UserRoles();
        userRoles.setUsername(user.getUsername());
        userRoles.setRoleName("teacher");
        userRolesDao.insert(userRoles);
    }

    @Override
    public User isRegister(String username) {
        return userDao.checkPhoneNum(username);
    }

    @Override
    public List<User> selectUserListByFlag(String s) {
        return userDao.selectUserListByFlag(s);
    }

    @Override
    public User selectUserById(Integer id) {
        return userDao.selectUserById(id);
    }

    @Override
    public void updateUser(User user) {
        Integer id = user.getId();
        String teacherName = user.getTeacherName();
        String username = user.getUsername();
        String password = user.getPassword();
        userDao.updateUser(id,teacherName,username,password);
    }

    @Override
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
    }

    @Override
    public void accessReq(Integer userId) {
        userDao.accessReq(userId);
    }

    @Override
    public void refuseReq(Integer userId) {
        User user = new User();
        user.setId(userId);
        userDao.delete(user);
    }

}
