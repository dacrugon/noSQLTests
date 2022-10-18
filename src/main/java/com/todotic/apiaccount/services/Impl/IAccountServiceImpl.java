package com.todotic.apiaccount.services.Impl;

import com.todotic.apiaccount.documents.Picture;
import com.todotic.apiaccount.repositories.IPictureRepository;
import com.todotic.apiaccount.services.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAccountServiceImpl implements IPictureService {

    @Autowired
    IPictureRepository repository;

    @Override
    public List<Picture> findAll() {
        return repository.findAll();
    }

    @Override
    public Picture create(Picture o) {
        return repository.save(o);
    }
}
