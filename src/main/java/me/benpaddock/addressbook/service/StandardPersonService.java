package me.benpaddock.addressbook.service;

import me.benpaddock.addressbook.dao.PersonDao;
import me.benpaddock.addressbook.model.Person;
import me.benpaddock.addressbook.model.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * User: pads
 * Date: 26/02/12
 */
public class StandardPersonService implements PersonService {

    @Autowired
    private PersonDao personDao;

    public Person getPerson(long id) {
        return personDao.getPerson(id);
    }

    @Override
    public List<Person> getPeople(String firstName, String lastName) {
        return personDao.getPeople(firstName, lastName);
    }

    @Override
    public List<Person> getAllPeople() {
        return personDao.getAllPeople();
    }

    @Override
    public Person createPerson(String firstName, String lastName) {
        Person person = new PersonEntity(firstName, lastName);
        personDao.savePerson(person);
        return person;
    }
}
