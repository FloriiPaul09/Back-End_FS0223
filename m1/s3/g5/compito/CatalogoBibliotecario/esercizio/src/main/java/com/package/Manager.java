package com.package;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;
import java.util.List;


public class Manager {
    private EntityManagerFactory entityManagerFactory;

    public Manager(){
        entityManagerFactory = Persistence.createEntityManagerFactory("libraryPersist")
    }
    
}
