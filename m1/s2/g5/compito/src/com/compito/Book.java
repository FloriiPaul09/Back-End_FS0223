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

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public static String toStringFile(Book book){
        return Book.class.getSimpleName() + ")" + book.isbn 
                                             + ")" + book.title
                                             + ")" + book.yearPub
                                             + ")" + book.numPages
                                             + ")" + book.auth
                                             + ")" + book.genre;
    }

    public static Book fromStringFile(String str){
        String[] split = str.split(")");

        return new Book(split[1], split[2], Integer.valueOf(split[3]), Integer.valueOf(split[4]), split[5], split[6]);
    }
}
