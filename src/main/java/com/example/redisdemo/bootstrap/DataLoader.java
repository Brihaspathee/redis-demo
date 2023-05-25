package com.example.redisdemo.bootstrap;

import com.example.redisdemo.domain.entity.Book;
import com.example.redisdemo.domain.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 16, July 2022
 * Time: 6:42 AM
 * Project: redis-demo
 * Package Name: com.example.redisdemo.bootstrap
 * To change this template use File | Settings | File and Code Template
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final BookRepository repository;

    @Override
    public void run(String... args) throws Exception {

        Book book1 = Book.builder()
                .bookId(1L)
                .bookName("Test 1")
                .author("Author 1")
                .publisher("Publisher 1")
                .build();
        Book book2 = Book.builder()
                .bookId(2L)
                .bookName("Test 2")
                .author("Author 2")
                .publisher("Publisher 2")
                .build();
        Book book3 = Book.builder()
                .bookId(3L)
                .bookName("Test 3")
                .author("Author 3")
                .publisher("Publisher 3")
                .build();
        Book book4 = Book.builder()
                .bookId(4L)
                .bookName("Test 4")
                .author("Author 4")
                .publisher("Publisher 4")
                .build();
        Book book5 = Book.builder()
                .bookId(5L)
                .bookName("Test 5")
                .author("Author 5")
                .publisher("Publisher 5")
                .build();
        repository.save(book1);
        repository.save(book2);
        repository.save(book3);
        repository.save(book4);
        repository.save(book5);


    }
}
