package com.package;

import javax.persistence;

@Entity
@Table(name = "magazine")
public class Magazine extends Catalogo {
    
    @Enumerated(EnumType.STRING)
    @Column(name = "period")
    private Enum period;

}
