package com.example.freighttransportation.repository;

import com.example.freighttransportation.model.WorkingBook;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingBookRepository extends MongoRepository<WorkingBook, String> {
}
