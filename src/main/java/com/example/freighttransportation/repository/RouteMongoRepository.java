package com.example.freighttransportation.repository;

import com.example.freighttransportation.model.Route;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteMongoRepository extends MongoRepository<Route, String> {
}
