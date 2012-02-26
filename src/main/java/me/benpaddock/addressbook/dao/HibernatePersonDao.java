package me.benpaddock.addressbook.dao;

import me.benpaddock.addressbook.model.Person;
import me.benpaddock.addressbook.model.PersonEntity;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: pads
 * Date: 19/02/12
 */
@Transactional
public class HibernatePersonDao implements PersonDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public void savePerson(Person person) {
        hibernateTemplate.persist(person);
    }

    public Person getPerson(long id) {
        return hibernateTemplate.load(PersonEntity.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Person> getPeople(String firstName, String lastName) {
        return hibernateTemplate.findByCriteria(DetachedCriteria.forClass(PersonEntity.class)
                .add(Restrictions.eq("firstName", firstName))
                .add(Restrictions.eq("lastName", lastName)));
    }

    @SuppressWarnings("unchecked")
    public List getAllPeople() {
        return hibernateTemplate.loadAll(PersonEntity.class);
    }

    public void updatePerson(Person person) {
        hibernateTemplate.update(person);
    }

    public void deletePerson(Person person) {
        hibernateTemplate.delete(person);
    }

    @SuppressWarnings("unused")
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

}
