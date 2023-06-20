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
public class Transport {
    @Id
    private String id;
    private String name;
    private String description;
    private String model;
    private String transportNumber;
    private double capacityInTons;
    private boolean needInspection;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Transport(String name, String description, String model, String transportNumber,
                     double capacityInTons, boolean needInspection) {
        this.name = name;
        this.description = description;
        this.model = model;
        this.transportNumber = transportNumber;
        this.capacityInTons = capacityInTons;
        this.needInspection = needInspection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTransportNumber() {
        return transportNumber;
    }

    public void setTransportNumber(String transportNumber) {
        this.transportNumber = transportNumber;
    }

    public double getCapacityInTons() {
        return capacityInTons;
    }

    public void setCapacityInTons(double capacityInTons) {
        this.capacityInTons = capacityInTons;
    }

    public boolean isNeedInspection() {
        return needInspection;
    }

    public void setNeedInspection(boolean needInspection) {
        this.needInspection = needInspection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport transport)) return false;
        return Objects.equals(getId(), transport.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
