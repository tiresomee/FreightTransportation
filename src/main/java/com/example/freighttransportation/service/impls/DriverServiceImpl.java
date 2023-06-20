package com.example.freighttransportation.service.impls;

import com.example.freighttransportation.model.Driver;
import com.example.freighttransportation.model.PersonalInformation;
import com.example.freighttransportation.model.WorkingBook;
import com.example.freighttransportation.repository.DriverMongoRepository;
import com.example.freighttransportation.service.interfaces.IDriverService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class DriverServiceImpl implements IDriverService {
    @Autowired
    DriverMongoRepository driverMongoRepository;

    //@PostConstruct
    public void init(){
        driverMongoRepository.save(new Driver("1","driver1","description1",
                new PersonalInformation("Olga","Olegivna","Kolotylo"),
                new WorkingBook(),5,
                now,now ));
    }


    @Override
    public Driver create(Driver driver) {
        return null;
    }

    @Override
    public Driver get(String id) {
        return null;
    }

    @Override
    public Driver update(Driver driver) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Driver> getAll() {
        return driverMongoRepository.findAll();
    }

    private LocalDateTime now = LocalDateTime.now();


}
