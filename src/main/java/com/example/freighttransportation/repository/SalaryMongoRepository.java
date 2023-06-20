package com.example.freighttransportation.repository;

import com.example.freighttransportation.model.Salary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryMongoRepository extends MongoRepository<Salary, String> {
}
