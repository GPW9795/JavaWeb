package com.gpw.dao;

import com.gpw.pojo.Book;

import java.util.List;

public interface BookDao {
    int addBook(Book book);

    int deleteBookById(Integer id);

    int updateBook(Book book);

    Book queryBookById(Integer id);

    List<Book> queryBooks();
}
