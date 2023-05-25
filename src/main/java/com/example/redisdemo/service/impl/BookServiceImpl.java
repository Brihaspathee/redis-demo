package com.example.redisdemo.service.impl;

import com.example.redisdemo.domain.entity.Book;
import com.example.redisdemo.domain.repository.BookRepository;
import com.example.redisdemo.service.interfaces.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 16, July 2022
 * Time: 6:30 AM
 * Project: redis-demo
 * Package Name: com.example.redisdemo.service.impl
 * To change this template use File | Settings | File and Code Template
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    @Override
    public Book createBook(Book book) {
        return repository.save(book);
    }

    @Override
    @Cacheable(cacheNames = "books", key = "#bookId")
    public Book getBook(Long bookId) {
        log.info("Getting book from DB");
        return repository.findById(bookId).orElseThrow();
    }

    @Override
    //@CachePut(value = "books", key = "#bookId")
    @CacheEvict(cacheNames = "books", key = "#book.bookId", allEntries = true)
    @CachePut(cacheNames = "books", key = "#book.bookId")
    public Book updateBook(Long bookId, Book book) {
        return repository.save(book);
    }

    @Override
    @CacheEvict(cacheNames = "books", key = "#bookId")
    public void deleteBook(Long bookId) {
        repository.deleteById(bookId);
    }
}
