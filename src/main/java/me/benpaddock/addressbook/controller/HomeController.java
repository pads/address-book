package me.benpaddock.addressbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: pads
 * Date: 26/02/12
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

}
