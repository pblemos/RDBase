package com.fernandopedro.recruitmentdb.service.impl;

import com.fernandopedro.recruitmentdb.model.Person;
import com.fernandopedro.recruitmentdb.repository.PersonRepository;
import com.fernandopedro.recruitmentdb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getPersonList() {
        return personRepository.findAll();
    }

    @Override
    public Person findUserById(long id) {
        return personRepository.findById(id);
    }

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }

    @Override
    public void edit(Person person) {
        personRepository.save(person);
    }

    @Override
    public void delete(long id) {
        personRepository.deleteById(id);
    }
}
