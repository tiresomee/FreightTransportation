package com.example.freighttransportation.controller.rest;

import com.example.freighttransportation.model.Route;
import com.example.freighttransportation.service.interfaces.IRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/routes")
public class RouteRestController {
    @Autowired
    IRouteService iRoureService;

    @RequestMapping("/")
    List<Route> showAll() {
        return iRoureService.getAll();
    }


}
