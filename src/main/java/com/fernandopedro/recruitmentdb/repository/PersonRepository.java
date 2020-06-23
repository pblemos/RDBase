package com.fernandopedro.recruitmentdb.repository;

import com.fernandopedro.recruitmentdb.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findById(long id);
    void deleteById(long id);
}
