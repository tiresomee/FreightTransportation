package com.example.freighttransportation.controller.rest;

import com.example.freighttransportation.model.Transportation;
import com.example.freighttransportation.service.interfaces.ITransportationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/transportations")
public class TransportationRestController {
    @Autowired
    ITransportationService iTransportationService;

    @RequestMapping("/")
    List<Transportation> showAll() {
        return iTransportationService.getAll();
    }
}
