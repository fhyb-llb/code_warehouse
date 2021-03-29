package com.code.spring.service;

import com.code.spring.dao.entity.Person;
import com.code.spring.dao.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person getPerson(Integer id) {
        return personRepository.getOneById(id);
    }
}
