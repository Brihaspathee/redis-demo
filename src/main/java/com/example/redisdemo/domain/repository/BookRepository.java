package com.example.redisdemo.domain.repository;

import com.example.redisdemo.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 16, July 2022
 * Time: 6:28 AM
 * Project: redis-demo
 * Package Name: com.example.redisdemo.domain.repository
 * To change this template use File | Settings | File and Code Template
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
