package me.benpaddock.addressbook.dao;

import me.benpaddock.addressbook.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: pads
 * Date: 19/02/12
 */
@Transactional
public class PersonDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public void savePerson(Person person) {
        hibernateTemplate.persist(person);
    }

    public Person getPerson(long id) {
        return hibernateTemplate.load(Person.class, id);
    }

    public void updatePerson(Person person) {
        hibernateTemplate.update(person);
    }

    public void deletePerson(Person person) {
        hibernateTemplate.delete(person);
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

}
