package com.todotic.apiaccount.controllers;

import com.todotic.apiaccount.documents.Account;
import com.todotic.apiaccount.services.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {

    @Autowired
    IAccountService service;

    @GetMapping("/accounts")
    public ResponseEntity<List<Account>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.ACCEPTED);
    }

    @PostMapping("/accounts")
    public Account create(Account account){
        return service.create(account);
    }
}
