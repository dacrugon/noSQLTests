package com.todotic.apiaccount.repositories;

import com.todotic.apiaccount.documents.Picture;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface IPictureRepository extends MongoRepository<Picture,String> {

}
