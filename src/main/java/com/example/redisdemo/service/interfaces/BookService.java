package com.example.redisdemo.service.interfaces;

import com.example.redisdemo.domain.entity.Book;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 16, July 2022
 * Time: 6:29 AM
 * Project: redis-demo
 * Package Name: com.example.redisdemo.service.interfaces
 * To change this template use File | Settings | File and Code Template
 */
public interface BookService {

    Book createBook(Book book);
    Book getBook(Long bookId);
    Book updateBook(Long bookId, Book book);
    void deleteBook(Long bookId);
}
