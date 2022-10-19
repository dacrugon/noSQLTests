package com.todotic.apiaccount.services.Impl;

import com.todotic.apiaccount.entity.Person;
import com.todotic.apiaccount.repositories.IPersonRepository;
import com.todotic.apiaccount.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    IPersonRepository repository;
    @Override
    @Transactional(readOnly = true)
    public List<Person> findAll() {
        return (List<Person>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Person save(Person person) {
        return repository.save(person);
    }

}
