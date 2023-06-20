package com.example.freighttransportation.service.impls;

import com.example.freighttransportation.model.Driver;
import com.example.freighttransportation.model.Route;
import com.example.freighttransportation.repository.RouteMongoRepository;
import com.example.freighttransportation.service.interfaces.IDriverService;
import com.example.freighttransportation.service.interfaces.IRouteService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class RouteServiceImpl implements IRouteService {
    @Autowired
    RouteMongoRepository routeMongoRepository;

    @Autowired
    IDriverService driverService;

    //@PostConstruct
    void init(){
        routeMongoRepository.save(new Route("efbr", "erger", 90, 4, "dfbrfb", "efgefbe", 12.5, LocalDateTime.now(),
                LocalDateTime.now()));
    }

    @Override
    public Route create(Route route) {
        route.setCreatedAt(LocalDateTime.now());
        return routeMongoRepository.save(route);
    }

    @Override
    public Route get(String id) {
        return routeMongoRepository.findById(id).orElse(null);
    }

    @Override
    public Route update(Route route) {
        String id = route.getId();
        route.setCreatedAt(routeMongoRepository.findById("3").orElse(null).getCreatedAt());
        route.setUpdatedAt(LocalDateTime.now());
        return routeMongoRepository.save(route);
    }

    @Override
    public void delete(String id) {
        routeMongoRepository.deleteById(id);
    }



    @Override
    public List<Route> getAll() {
        return routeMongoRepository.findAll();
    }

    @Override
    public double getPrice(Route route, Driver driver) {
        return route.getDistance()* route.getPricePerKilometer() +
                route.getDistance()* route.getPricePerKilometer() * driver.getRate() * 0.01;
    }


}
