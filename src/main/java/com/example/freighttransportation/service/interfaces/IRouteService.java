package com.example.freighttransportation.service.interfaces;

import com.example.freighttransportation.model.Driver;
import com.example.freighttransportation.model.Route;

import java.util.List;

public interface IRouteService {
    Route create(Route route);
    Route get(String id);
    Route update(Route route);
    void delete(String id);
    List<Route> getAll();
    double getPrice(Route route, Driver driver);
}
