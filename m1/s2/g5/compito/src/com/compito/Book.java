package com.compito;

public class Book extends ElemLetteratura {
    private String auth;
    private String genre;

    public Book(String isbn, String title, Integer yearPub, Integer numPages, String auth, String genre) {
        super(isbn, title, yearPub, numPages);
        this.auth = auth;
        this.genre = genre;
    }

    public String getAuth(){
        return auth;
    }

    public void setAuth(String auth){
        this.auth = auth;
    }
}
