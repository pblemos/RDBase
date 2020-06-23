package com.fernandopedro.recruitmentdb.service;

import com.fernandopedro.recruitmentdb.model.Person;
import java.util.List;

public interface PersonService {
    public List<Person> getPersonList();

    public Person findUserById(long id);

    public void save(Person user);

    public void edit(Person user);

    public void delete(long id);

}
