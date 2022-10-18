package com.todotic.apiaccount.controllers;

import com.todotic.apiaccount.documents.Picture;
import com.todotic.apiaccount.services.IPictureService;
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
public class PictureController {

    @Autowired
    IPictureService service;

    @GetMapping("/pictures")
    public ResponseEntity<List<Picture>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.ACCEPTED);
    }

    @PostMapping("/pictures")
    public Picture create(Picture picture){
        return service.create(picture);
    }
}
