package com.example.freighttransportation.repository;

import com.example.freighttransportation.model.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverMongoRepository extends MongoRepository<Driver,String>{

}
