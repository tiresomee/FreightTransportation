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
public class Salary {
    @Id
    private String id;
    private String name;
    private String description;
    private Driver driver;
    private double experienceOfWork;
    private double standardSalary;
    private double additionalSalary;
    private double finalSalary;
    private LocalDateTime chargeFrom;
    private LocalDateTime chargeTo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Salary(String name, String description, Driver driver, double experienceOfWork, double standardSalary,
                  double additionalSalary, double finalSalary, LocalDateTime chargeFrom, LocalDateTime chargeTo) {
        this.name = name;
        this.description = description;
        this.driver = driver;
        this.experienceOfWork = experienceOfWork;
        this.standardSalary = standardSalary;
        this.additionalSalary = additionalSalary;
        this.finalSalary = finalSalary;
        this.chargeFrom = chargeFrom;
        this.chargeTo = chargeTo;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Driver getDriver() {
        return driver;
    }

    public double getExperienceOfWork() {
        return experienceOfWork;
    }

    public double getStandardSalary() {
        return standardSalary;
    }

    public double getAdditionalSalary() {
        return additionalSalary;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    public LocalDateTime getChargeFrom() {
        return chargeFrom;
    }

    public LocalDateTime getChargeTo() {
        return chargeTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Salary salary)) return false;
        return Objects.equals(getId(), salary.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
