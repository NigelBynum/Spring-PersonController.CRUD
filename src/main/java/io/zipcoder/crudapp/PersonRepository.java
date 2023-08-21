package io.zipcoder.crudapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    Person findById(Long id);
    List<Person> findAll();

    void delete(Person p);

    Person save(Person p);



}