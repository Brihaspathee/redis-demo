package com.example.redisdemo.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 16, July 2022
 * Time: 6:27 AM
 * Project: redis-demo
 * Package Name: com.example.redisdemo.domain.entity
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {

    private static final long serialVersionUID = 1307525040224585678L;

    @Id
    private Long bookId;

    private String bookName;

    private String author;

    private String publisher;
}
