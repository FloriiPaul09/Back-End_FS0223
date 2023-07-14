package com.package;

import javax.persistence;

@Entity
@Table(name = "loans")
public class Loans {
    
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    

}
