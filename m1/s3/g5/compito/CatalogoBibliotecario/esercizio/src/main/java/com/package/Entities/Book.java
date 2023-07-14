package com.package;

import javax.persistence;

@Entity
@Table(name = "book")
public class Book extends Catalogo {

    @Column(name = "author")
    private String author;

    @Column(name = "genre")
    private String genre;
    

}
