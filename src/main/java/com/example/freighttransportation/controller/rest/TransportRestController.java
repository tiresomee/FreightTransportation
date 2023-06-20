package com.example.freighttransportation.controller.rest;

import com.example.freighttransportation.model.Transport;
import com.example.freighttransportation.service.interfaces.ITransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/transports")
public class TransportRestController {
    @Autowired
    ITransportService iTransportService;

    @RequestMapping("/")
    List<Transport> showAll() {
        return iTransportService.getAll();
    }
}
