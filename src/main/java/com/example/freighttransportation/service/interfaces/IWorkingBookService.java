package com.example.freighttransportation.service.interfaces;

import com.example.freighttransportation.model.WorkingBook;

import java.util.List;

public interface IWorkingBookService {
    WorkingBook create(WorkingBook workingBook);
    WorkingBook get(String id);
    WorkingBook update(WorkingBook workingBook);
    void delete(String id);
    List<WorkingBook> getAll();
}
