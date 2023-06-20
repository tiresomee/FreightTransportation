package com.example.freighttransportation.repository;

import com.example.freighttransportation.model.Transport;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportMongoRepository extends MongoRepository<Transport, String> {
}
