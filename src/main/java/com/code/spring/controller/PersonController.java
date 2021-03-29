package com.code.spring.controller;


import com.code.spring.dao.entity.Person;
import com.code.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PersonController {

    @Autowired
    @Resource
    private PersonService personService;

    @GetMapping("/rest/v1/demo/person")
    public Person queryPerson(@RequestParam("id") Integer id) {
        return personService.getPerson(id);
    }
}
