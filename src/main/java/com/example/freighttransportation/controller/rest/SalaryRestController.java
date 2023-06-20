package com.example.freighttransportation.controller.rest;

import com.example.freighttransportation.model.Salary;
import com.example.freighttransportation.service.interfaces.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/salaries")
public class SalaryRestController {
    @Autowired
    ISalaryService iSalaryService;

    @RequestMapping("/")
    List<Salary> showAll() {
        return iSalaryService.getAll();
    }
}
