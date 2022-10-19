package com.todotic.apiaccount.services;

import com.todotic.apiaccount.entity.Person;

import java.util.List;


public interface IPersonService {
    List<Person> findAll();

    Person save(Person person);

}
