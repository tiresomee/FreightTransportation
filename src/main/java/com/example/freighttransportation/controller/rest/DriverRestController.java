package com.example.freighttransportation.controller.rest;

import com.example.freighttransportation.model.Driver;
import com.example.freighttransportation.service.impls.DriverServiceImpl;
import com.example.freighttransportation.service.interfaces.IDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/drivers")
public class DriverRestController {
    @Autowired
    IDriverService iDriverService;

    @RequestMapping("/")
    List<Driver> showAll() {
        return iDriverService.getAll();
    }

}

