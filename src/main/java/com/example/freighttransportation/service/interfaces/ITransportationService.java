package com.example.freighttransportation.service.interfaces;

import com.example.freighttransportation.model.Transportation;

import java.util.List;

public interface ITransportationService {
    Transportation create(Transportation transportation);
    Transportation get(String id);
    Transportation update(Transportation transportation);
    void delete(String id);
    List<Transportation> getAll();
}
