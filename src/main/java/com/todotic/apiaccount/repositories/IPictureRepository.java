package com.todotic.apiaccount.repositories;

import com.todotic.apiaccount.documents.Picture;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPictureRepository extends MongoRepository<Picture,String> {


}
