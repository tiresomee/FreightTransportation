package com.example.freighttransportation.controller.rest;

import com.example.freighttransportation.model.WorkingBook;
import com.example.freighttransportation.service.interfaces.IWorkingBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/workingBooks")
public class WorkingBookRestController {
    @Autowired
    IWorkingBookService iWorkingBookService;

    @RequestMapping("/")
    List<WorkingBook> showAll() {
        return iWorkingBookService.getAll();
    }

}
