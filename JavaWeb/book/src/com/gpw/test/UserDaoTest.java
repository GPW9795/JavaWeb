package com.gpw.test;

import com.gpw.dao.UserDao;
import com.gpw.dao.impl.UserDaoImpl;
import com.gpw.pojo.User;
import org.junit.jupiter.api.Test;

class UserDaoTest {
    UserDao userDao = new UserDaoImpl();

    @Test
    void queryUserByUsername() {
        User user = userDao.queryUserByUsername("admin");
        if (user == null) {
            System.out.println("用户名可用！");
        } else {
            System.out.println("用户名存在！");
        }
    }

    @Test
    void queryUserByUsernameAndPassword() {
        User user = userDao.queryUserByUsernameAndPassword("admin", "admin");
        if (user == null) {
            System.out.println("用户名或密码错误，登录失败！");
        } else {
            System.out.println("登录成功！");
        }
    }

    @Test
    void saveUser() {
        userDao.saveUser(new User(null, "gpw", "gpw710324", "vivian9795@163.com"));
    }
}