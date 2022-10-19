package com.todotic.apiaccount.repositories;

import com.todotic.apiaccount.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface IPersonRepository extends JpaRepository<Person, Long> {
}
