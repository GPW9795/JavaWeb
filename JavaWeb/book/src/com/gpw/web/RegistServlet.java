package com.gpw.web;

import com.gpw.pojo.User;
import com.gpw.service.UserService;
import com.gpw.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1 获取请求的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");
        // 2 检查验证码是否正确，先写死
        if ("abcd".equalsIgnoreCase(code)) { // 验证码正确
            // 3 检查用户名是否可用
            if (userService.existUsername(username)) { // 不可用
                System.out.println("用户名已存在");
                req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
            } else { // 可用
                userService.registUser(new User(null, username, password, email));
                req.getRequestDispatcher("/pages/user/regist_success.jsp").forward(req, resp);
            }
        } else { // 验证码错误
            System.out.println("验证码错误");
            req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
        }
    }
}
