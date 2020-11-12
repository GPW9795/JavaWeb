package com.gpw.test;

import com.gpw.pojo.User;
import com.gpw.service.UserService;
import com.gpw.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;

class UserServiceTest {
    UserService userService = new UserServiceImpl();

    @Test
    void registUser() {
        userService.registUser(new User(null, "cbx", "666", "2334@wefd.com"));
        userService.registUser(new User(null, "lxm", "666", "23fdv4@wefd.com"));
        userService.registUser(new User(null, "zdy", "666", "2334wedf4@wefd.com"));
    }

    @Test
    void login() {
        System.out.println(userService.login(new User(null, "gpw", "gpw710324", null)));
    }

    @Test
    void existUsername() {
        System.out.println(userService.existUsername("gpw"));
    }
}