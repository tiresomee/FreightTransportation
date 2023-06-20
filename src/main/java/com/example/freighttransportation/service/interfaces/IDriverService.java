package com.example.freighttransportation.service.interfaces;

import com.example.freighttransportation.model.Driver;

import java.util.List;

public interface IDriverService  {
    Driver create(Driver driver);
    Driver get(String id);
    Driver update(Driver driver);
    void delete(String id);
    List<Driver> getAll();
}
