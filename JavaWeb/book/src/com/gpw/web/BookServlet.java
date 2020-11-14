package com.gpw.web;

import com.gpw.pojo.Book;
import com.gpw.service.BookService;
import com.gpw.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BookServlet extends BaseServlet {

    private BookService bookService = new BookServiceImpl();

    /**
     * 添加图书
     */
    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    /**
     * 删除图书
     */
    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    /**
     * 修改图书
     */
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    /**
     * 查询图书
     */
    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = bookService.queryBooks();
        req.setAttribute("books", books);
        req.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(req, resp);
    }
}
