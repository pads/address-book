package me.benpaddock.addressbook.controller;

import me.benpaddock.addressbook.entity.PersonEntity;
import me.benpaddock.addressbook.model.Person;
import me.benpaddock.addressbook.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * User: pads
 * Date: 20/02/12
 */
@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping("/getPerson")
    public ModelAndView getPerson() {
        Map<String, Person> model = new HashMap<String, Person>();
        model.put("person", new PersonEntity("Ben", "Paddock"));
        return new ModelAndView("person", model);
    }

    @RequestMapping("/createPerson")
    public ModelAndView createPerson() {
        Person person = personService.createPerson("Karen", "Melrose");
        Map<String, Person> model = new HashMap<String, Person>();
        model.put("person", person);
        return new ModelAndView("person", model);
    }

}