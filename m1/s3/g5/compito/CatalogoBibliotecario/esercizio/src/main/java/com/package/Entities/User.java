package com.package;

import javax.persistence;

@Entity
@Table(name = "user")
public class User {
    
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "card_number", unique = true)
    private Integer cardNumber;

    //Constructor
    public User() {}

    //Name methods
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //Surname methods
    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    //Birth date methods
    public LocalDate getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }

    //Card number methods
    public Integer getCardNumber(){
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber){
        this.cardNumber = cardNumber;
    }

}
