package com.example.freighttransportation.service.interfaces;

import com.example.freighttransportation.model.Salary;

import java.util.List;

public interface ISalaryService{
    Salary create(Salary driverSalary);
    Salary get(String id);
    Salary update(Salary driverSalary);
    void delete(String id);
    List<Salary> getAll();
}
