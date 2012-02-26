package me.benpaddock.addressbook.service;

import me.benpaddock.addressbook.dao.PersonDao;
import me.benpaddock.addressbook.entity.PersonEntity;
import me.benpaddock.addressbook.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: pads
 * Date: 26/02/12
 */
@Service
public class StandardPersonService implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public Person getPerson(long id) {
        return personDao.getPerson(id);
    }

    @Override
    public Person createPerson(String firstName, String lastName) {
        Person person = new PersonEntity(firstName, lastName);
        personDao.savePerson(person);
        return person;
    }
}
