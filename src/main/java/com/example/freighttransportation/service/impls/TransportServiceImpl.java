package com.example.freighttransportation.service.impls;

import com.example.freighttransportation.model.Transport;
import com.example.freighttransportation.repository.TransportMongoRepository;
import com.example.freighttransportation.service.interfaces.ITransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransportServiceImpl implements ITransportService {
    @Autowired
    TransportMongoRepository transportMongoRepository;
    @Override
    public Transport create(Transport transport) {
        return null;
    }

    @Override
    public Transport get(String id) {
        return null;
    }

    @Override
    public Transport update(Transport transport) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Transport> getAll() {
        return null;
    }
}
