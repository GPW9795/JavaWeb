package com.gpw;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseIOServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setCharacterEncoding("UTF-8");
//        resp.setHeader("Content-Type", "text/html; UTF-8");
        resp.setContentType("text/html; charset = UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write("爱你爱你!!!");
    }
}
