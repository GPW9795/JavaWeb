package com.gpw.web;

import com.gpw.pojo.User;
import com.gpw.service.UserService;
import com.gpw.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User loginUser = userService.login(new User(null, username, password, null));
        if (loginUser != null) {
            System.out.println("登录成功！");
            req.getRequestDispatcher("/pages/user/login_success.jsp").forward(req, resp);
        } else {
            System.out.println("登录失败！");
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
        }
    }
}
