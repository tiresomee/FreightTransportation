package com.example.freighttransportation.repository;

import com.example.freighttransportation.model.Transportation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportationMongoRepository extends MongoRepository<Transportation, String> {
}
