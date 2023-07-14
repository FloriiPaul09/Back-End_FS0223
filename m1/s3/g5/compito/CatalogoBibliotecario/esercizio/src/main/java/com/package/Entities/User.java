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
    private localDate birthDate;

    @Column(name = "card_number", unique = true)
    private Integer cardNumber;

}
