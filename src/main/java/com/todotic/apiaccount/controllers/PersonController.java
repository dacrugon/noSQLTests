package com.todotic.apiaccount.controllers;

import com.todotic.apiaccount.entity.Person;
import com.todotic.apiaccount.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api2")
public class PersonController {

    @Autowired
    private IPersonService service;

    @GetMapping("/people")
    public ResponseEntity<List<Person>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.ACCEPTED);
    }
}
