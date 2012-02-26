package me.benpaddock.addressbook.controller;

import me.benpaddock.addressbook.model.Person;
import me.benpaddock.addressbook.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: pads
 * Date: 20/02/12
 */
@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping("/listPeople")
    public ModelAndView listPeople() {
        Map<String, List<Person>> model = new HashMap<String, List<Person>>();
        model.put("people", personService.getAllPeople());
        return new ModelAndView("people", model);
    }

    @RequestMapping("/findPeople")
    public String findPerson() {
        return "find-people";
    }

    @RequestMapping(value = "getPeople", method = RequestMethod.POST)
    public ModelAndView getPeople(@RequestParam(value = "firstName") String firstName,
                                  @RequestParam(value = "lastName") String lastName) {
        List<Person> people = personService.getPeople(firstName, lastName);
        Map<String, List<Person>> model = new HashMap<String, List<Person>>();
        model.put("person", people);
        return new ModelAndView("people", model);
    }

    @RequestMapping("/addPerson")
    public String getPersonForm() {
        return "create-person";
    }

    @RequestMapping(value = "/createPerson", method = RequestMethod.POST)
    public ModelAndView createPerson(@RequestParam(value = "firstName") String firstName,
                                     @RequestParam(value = "lastName") String lastName) {
        Person person = personService.createPerson(firstName, lastName);
        Map<String, Person> model = new HashMap<String, Person>();
        model.put("person", person);
        return new ModelAndView("person", model);
    }

}