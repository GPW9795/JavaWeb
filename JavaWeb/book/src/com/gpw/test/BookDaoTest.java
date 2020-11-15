package com.gpw.test;

import com.gpw.dao.BookDao;
import com.gpw.dao.impl.BookDaoImpl;
import com.gpw.pojo.Book;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookDaoTest {

    private BookDao bookDao = new BookDaoImpl();

    @Test
    void addBook() {
        bookDao.addBook(new Book(null, "我爱陈炳旭", "高沛雯", new BigDecimal(9999), 10, 0, null));
    }

    @Test
    void deleteBookById() {
        bookDao.deleteBookById(21);
    }

    @Test
    void updateBook() {
        bookDao.updateBook(new Book(21, "我爱陈炳旭", "高沛雯", new BigDecimal(100), 10, 0, null));
    }

    @Test
    void queryBookById() {
        Book book = bookDao.queryBookById(21);
        System.out.println(book);
    }

    @Test
    void queryBooks() {
        List<Book> list = bookDao.queryBooks();
        for (Book book : list) {
            System.out.println(book);
        }
    }

    @Test
    void queryForPageTotalCount() {
        int count = bookDao.queryForPageTotalCount();
        System.out.println(count);
    }

    @Test
    void queryForPageItems() {
        for (Book book : bookDao.queryForPageItems(0, 10)) {
            System.out.println(book);
        }
    }
}