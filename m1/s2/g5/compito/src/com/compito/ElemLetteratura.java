package com.compito;

public abstract class ElemLetteratura {
    protected String isbn;
    protected String title;
    protected Integer yearPub;
    protected Integer numPages;

    public ElemLetteratura(String isbn, String title, Integer yearPub, Integer num){
        this.isbn = isbn;
        this.title = title;
        this.yearPub = yearPub;
        this.numPages = numPages;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public Integer getYearPub(){
        return yearPub;
    }

    public void setYearPub(Integer yearPub){
        this.yearPub = yearPub;
    }

    public Integer getNumPages(){
        return numPages;
    }

    public void setNumPages(Integer numPages){
        this.numPages = numPages;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
