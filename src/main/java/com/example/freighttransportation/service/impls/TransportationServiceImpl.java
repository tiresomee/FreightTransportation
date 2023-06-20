package com.example.freighttransportation.service.impls;

import com.example.freighttransportation.model.Transport;
import com.example.freighttransportation.model.Transportation;
import com.example.freighttransportation.repository.TransportationMongoRepository;
import com.example.freighttransportation.service.interfaces.IDriverService;
import com.example.freighttransportation.service.interfaces.ITransportationService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransportationServiceImpl implements ITransportationService {
    @Autowired
    TransportationMongoRepository transportationMongoRepository;

    @Autowired
    RouteServiceImpl routeService;

    @Autowired
    IDriverService driverService;

    @PostConstruct
    void init(){
        transportationMongoRepository.save(new Transportation("dvefbe", "dfbrbfb", driverService.getAll(),
                routeService.get("64905d6bd18b4e2070b3a3c6"), new Transport("efbve", "efve", "ege", "fb", 12, true),
                routeService.getPrice(routeService.get("64905d6bd18b4e2070b3a3c6"), driverService.get("1"))));
    }

    @Override
    public Transportation create(Transportation transportation) {
        return null;
    }

    @Override
    public Transportation get(String id) {
        return null;
    }

    @Override
    public Transportation update(Transportation transportation) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Transportation> getAll() {
        return null;
    }
}
