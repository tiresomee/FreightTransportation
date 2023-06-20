package com.example.freighttransportation.service.impls;

import com.example.freighttransportation.model.WorkingBook;
import com.example.freighttransportation.repository.WorkingBookRepository;
import com.example.freighttransportation.service.interfaces.IWorkingBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkingBookServiceImpl implements IWorkingBookService {

    @Autowired
    WorkingBookRepository workingBookRepository;

    @Override
    public WorkingBook create(WorkingBook workingBook) {
        return null;
    }

    @Override
    public WorkingBook get(String id) {
        return null;
    }

    @Override
    public WorkingBook update(WorkingBook workingBook) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<WorkingBook> getAll() {
        return null;
    }
}
