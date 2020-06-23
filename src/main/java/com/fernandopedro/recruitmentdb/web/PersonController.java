package com.fernandopedro.recruitmentdb.web;

import com.fernandopedro.recruitmentdb.model.Person;
import com.fernandopedro.recruitmentdb.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class PersonController {
    @Resource
    PersonService personService;

    @GetMapping("/display/all")
    public ModelAndView displayAllUsers() {
        ModelAndView modelAndView = new ModelAndView("DisplayAllPersons");
        modelAndView.addObject("persons", personService.getPersonList());
        modelAndView.addObject("person", new Person());
        return modelAndView;
    }
}
