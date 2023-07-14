package com.package;

import javax.persistence;

@Entity
@Table(name = "catalogo")
public class Catalogo {
    
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "isbn", unique = true)
    private String isbn;

    @Column(name = "title")
    private String title;

    @Column(name = "publication_year")
    private Integer publicationYear;

    @Column (name = "num_pages")
    private Integer numPages;

    //Constructor
    public Catalogo() {}


    //Id methods
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    //ISBN methods
    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    //Title methods
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    //Year of publication methods
    public Integer getPublicationYear(){
        return publicationYear;
    }

    public void setPublicationYear(){
        this.publicationYear = publicationYear;
    }

    //Number of pages methods
    public Integer getNumPages(){
        return numPages;
    }

    public void setNumPages(){
        this.numPages = numPages;
    }

}