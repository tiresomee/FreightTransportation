package com.example.freighttransportation.service.impls;

import com.example.freighttransportation.model.Salary;
import com.example.freighttransportation.repository.SalaryMongoRepository;
import com.example.freighttransportation.service.interfaces.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalaryServiceImpl implements ISalaryService {
    @Autowired
    SalaryMongoRepository salaryMongoRepository;


    @Override
    public Salary create(Salary salary) {
        return null;
    }

    @Override
    public Salary get(String id) {
        return null;
    }

    @Override
    public Salary update(Salary salary) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Salary> getAll() {
        return null;
    }
}
