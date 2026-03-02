package org.example;

import org.example.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import java.util.List;


public class App 
{
    public static void main( String[] args )
    {

//        System.out.println( "Hello World!" );
        Person pr = new Person();
        pr.setId(3093);
        pr.setName("Somya");

        Configuration configuration = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(pr);
        Person p = session.get(Person.class, 1);
        System.out.println(p);
        p.setName("sam");
        session.merge(p);
        session.remove(p);

        List<Person> list = session.createQuery("from Person", Person.class).getResultList();
        System.out.println("all person" + list);
        transaction.commit();


    }
}
