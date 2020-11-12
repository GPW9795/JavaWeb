package com.gpw.dao;

import com.gpw.pojo.User;

public interface UserDao {
    /**
     * 根据用户名查询用户信息，返回null无此用户
     */
    User queryUserByUsername(String username);

    /**
     * 根据用户名和密码查询用户信息，返回null无此用户
     */
    User queryUserByUsernameAndPassword(String username, String password);

    /**
     * 保存用户信息，返回-1失败
     */
    int saveUser(User user);
}
