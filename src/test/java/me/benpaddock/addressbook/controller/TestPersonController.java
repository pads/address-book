package me.benpaddock.addressbook.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.assertEquals;

/**
 * User: pads
 * Date: 20/02/12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestPersonController {

    @Autowired
    PersonController controller;

    @Test
    public void testPersonController() throws Exception {

        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("person.jsp", modelAndView.getViewName());

    }

}
