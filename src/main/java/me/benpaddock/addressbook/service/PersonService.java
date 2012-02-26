package me.benpaddock.addressbook.service;

import me.benpaddock.addressbook.model.Person;

/**
 * User: pads
 * Date: 26/02/12
 */
public interface PersonService {

    public Person getPerson(long id);

    public Person createPerson(String firstName, String lastName);

}
