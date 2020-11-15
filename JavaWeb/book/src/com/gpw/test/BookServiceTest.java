package com.gpw.test;

import com.gpw.pojo.Book;
import com.gpw.pojo.Page;
import com.gpw.service.BookService;
import com.gpw.service.impl.BookServiceImpl;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {
    private BookService bookService = new BookServiceImpl();

    @Test
    void addBook() {
        bookService.addBook(new Book(null, "我爱陈炳旭", "高沛雯", new BigDecimal(9999), 10, 0, null));
    }

    @Test
    void deleteBookById() {
        bookService.deleteBookById(22);
    }

    @Test
    void updateBook() {
        bookService.updateBook(new Book(22, "我爱陈炳旭", "高沛雯", new BigDecimal(9999), 10, 0, null));
    }

    @Test
    void queryBookById() {
        System.out.println(bookService.queryBookById(22));
    }

    @Test
    void queryBooks() {
        List<Book> list = bookService.queryBooks();
        for (Book book : list) {
            System.out.println(book);
        }
    }

    @Test
    void page() {
        Page<Book> page = bookService.page(1, 10);
        System.out.println(page);
    }
}