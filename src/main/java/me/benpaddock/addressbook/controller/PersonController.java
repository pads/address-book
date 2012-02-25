package me.benpaddock.addressbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: pads
 * Date: 20/02/12
 */
@Controller
public class PersonController {

    @RequestMapping("/person")
    public String handleRequest() {

        return "person";

    }

}