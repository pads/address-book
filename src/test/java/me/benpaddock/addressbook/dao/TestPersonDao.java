package me.benpaddock.addressbook.dao;

import me.benpaddock.addressbook.model.Person;
import me.benpaddock.addressbook.model.PersonEntity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: pads
 * Date: 19/02/12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:testApplicationContext.xml"})
@Transactional
public class TestPersonDao {

    @Autowired
    private HibernatePersonDao personDao;

    @Before
    public void setUp() {
        personDao.savePerson(new PersonEntity("Ben", "Paddock"));
        personDao.savePerson(new PersonEntity("Karen", "Melrose"));
    }

    @After
    public void tearDown() {

    }

    @Test
    public void canGetSinglePerson() {
        Person ben = personDao.getPerson(1);
        System.out.println("ID: " + ben.getId() + ": " + ben.getFirstName() + " " + ben.getLastName());
    }

    @Test
    public void canFindPeople() {
        List<Person> results = personDao.getPeople("Karen", "Melrose");
        Person karen = results.get(0);
        System.out.println("ID: " + karen.getId() + ": " + karen.getFirstName() + " " + karen.getLastName());
    }
}
