package org.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.jpa.entity.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

//        Person p1 = new Person();
//        p1.setId(344);
//        p1.setName("Fin");
//        p1.setSalary(1.2);
//
//        Person p2 = new Person();
//        p2.setId(23);
//        p2.setName("sam");
//        p2.setSalary(4.5);
//
//        entityManager.persist(p1);
//        entityManager.persist(p2);
//
//        entityTransaction.commit();

//        Person person = entityManager.find(Person.class,1);
//        System.out.println(person);
//        List<Person> list = entityManager.createQuery("from Person", Person.class).getResultList();
//        for(Person persons : list){
//            System.out.println(persons);
//        }
       // update

        Person person = entityManager.find(Person.class,1);
        person.setSalary(3.4);
        entityManager.merge(person);
        List<Person> list = entityManager.createQuery("from Person", Person.class).getResultList();
        for(Person persons : list){
            System.out.println(persons);
        }
        entityTransaction.commit();

// delete
        Person p1 = entityManager.find(Person.class,1);
        entityManager.remove(p1);
        entityTransaction.commit();




    }

}
