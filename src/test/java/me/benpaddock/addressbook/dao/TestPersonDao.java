package me.benpaddock.addressbook.dao;

import me.benpaddock.addressbook.domain.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * User: pads
 * Date: 19/02/12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestPersonDao {

    @Autowired
    private PersonDao personDao;

    @Before
    public void setUp() {
        personDao.savePerson(new Person("Ben", "Paddock"));
        personDao.savePerson(new Person("Karen", "Melrose"));
    }

    @After
    public void tearDown() {

    }

    @Test
    public void testPersonDao() {
        Person ben = personDao.getPerson(1);
        System.out.println("ID: " + ben.getId() + ": " + ben.getFirstName() + " " + ben.getLastName());
        Person karen = personDao.getPerson(1);
        System.out.println("ID: " + karen.getId() + ": " + karen.getFirstName() + " " + karen.getLastName());
    }
}
