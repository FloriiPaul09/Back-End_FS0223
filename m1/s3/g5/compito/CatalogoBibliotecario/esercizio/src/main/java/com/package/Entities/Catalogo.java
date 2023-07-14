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


}