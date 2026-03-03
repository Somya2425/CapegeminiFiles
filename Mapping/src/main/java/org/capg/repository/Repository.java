package org.capg.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Repository {
    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

}
