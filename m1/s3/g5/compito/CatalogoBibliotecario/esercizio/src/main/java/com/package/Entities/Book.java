package com.package;

import javax.persistence;

@Entity
@Table(name = "book")
public class Book extends Catalogo {

    @Column(name = "author")
    private String author;

    @Column(name = "genre")
    private String genre;
    
    //Constructor
    public Book() {}

    //Author methods
    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    //Genres methods
    public String getGenres(){
        return genres;
    }

    public void setGenres(String genres){
        this.genres = genres;
    }
}
