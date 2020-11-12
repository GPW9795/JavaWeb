package com.gpw.service;

import com.gpw.pojo.User;

public interface UserService {
    /**
     * 注册用户
     */
    void registUser(User user);

    /**
     * 登陆
     */
    User login(User user);

    /**
     * 检查用户名是否可用，true-用户名存在，false-用户名可用
     */
    boolean existUsername(String username);
}
