package me.benpaddock.addressbook.dao;

import me.benpaddock.addressbook.model.Person;

import java.util.List;

/**
 * User: pads
 * Date: 26/02/12
 */
public interface PersonDao {

    public void savePerson(Person person);

    public Person getPerson(long id);

    public List<Person> getPeople(String firstName, String lastName);

    public List<Person> getAllPeople();

    public void updatePerson(Person person);

    public void deletePerson(Person person);

}
