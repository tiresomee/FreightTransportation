package com.example.freighttransportation.service.interfaces;

import com.example.freighttransportation.model.Transport;

import java.util.List;

public interface ITransportService {
    Transport create(Transport transport);
    Transport get(String id);
    Transport update(Transport transport);
    void delete(String id);
    List<Transport> getAll();
}
