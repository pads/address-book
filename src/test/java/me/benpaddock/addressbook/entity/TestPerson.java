package me.benpaddock.addressbook.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * User: pads
 * Date: 19/02/12
 */
public class TestPerson {

    SessionFactory sessionFactory;

    @Before
    public void setUp() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @After
    public void tearDown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    @Test
    public void testPerson() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(new PersonEntity("Ben", "Paddock"));
        session.save(new PersonEntity("Karen", "Melrose"));
        session.getTransaction().commit();
        session.close();

        session = sessionFactory.openSession();
        session.beginTransaction();
        List result = session.createQuery("from Person").list();
        for (PersonEntity person : (List<PersonEntity>) result) {
            System.out.println("ID: " + person.getId() + ": " + person.getFirstName() + " " + person.getLastName());
        }
        session.getTransaction().commit();
        session.close();
    }
}
