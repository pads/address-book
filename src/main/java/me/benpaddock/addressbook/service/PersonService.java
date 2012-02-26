package me.benpaddock.addressbook.service;

import me.benpaddock.addressbook.model.Person;

import java.util.List;

/**
 * User: pads
 * Date: 26/02/12
 */
public interface PersonService {

    public Person getPerson(long id);

    public List<Person> getPeople(String firstName, String lastName);

    public List<Person> getAllPeople();

    public Person createPerson(String firstName, String lastName);

}
