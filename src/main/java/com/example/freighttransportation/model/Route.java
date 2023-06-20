package com.example.freighttransportation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Route {
    @Id
    private String id;
    private String name;
    private String description;
    private int distance;
    private double daysInRoad;
    private String PointOfDeparture;
    private String destination;
    private double pricePerKilometer;
    private LocalDateTime startDay;
    private LocalDateTime endDay;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Route(String name, String description, int distance, double daysInRoad, String pointOfDeparture,
                 String destination, double pricePerKilometer, LocalDateTime startDay, LocalDateTime endDay) {
        this.name = name;
        this.description = description;
        this.distance = distance;
        this.daysInRoad = daysInRoad;
        PointOfDeparture = pointOfDeparture;
        this.destination = destination;
        this.pricePerKilometer = pricePerKilometer;
        this.startDay = startDay;
        this.endDay = endDay;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Route route)) return false;
        return Objects.equals(getId(), route.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}


