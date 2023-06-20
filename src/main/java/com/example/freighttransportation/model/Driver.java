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
public class Driver {
    @Id
    private String id;
    private String name;
    private String description;
    private PersonalInformation PersonalInformationOfRider;
    private WorkingBook workingBook;
    private int rate;
    private LocalDateTime startDay;
    private LocalDateTime endDay;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Driver(String name, String description, PersonalInformation personalInformationOfRider,
                  WorkingBook workingBook, int rate, LocalDateTime startDay, LocalDateTime endDay) {
        this.name = name;
        this.description = description;
        PersonalInformationOfRider = personalInformationOfRider;
        this.workingBook = workingBook;
        this.rate = rate;
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public Driver(String id, String name, String description, PersonalInformation personalInformationOfRider,
                  WorkingBook workingBook,int rate, LocalDateTime startDay, LocalDateTime endDay) {
        this.id = id;
        this.name = name;
        this.description = description;
        PersonalInformationOfRider = personalInformationOfRider;
        this.workingBook = workingBook;
        this.rate = rate;
        this.startDay = startDay;
        this.endDay = endDay;
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

    public PersonalInformation getPersonalInformationOfRider() {
        return PersonalInformationOfRider;
    }

    public void setPersonalInformationOfRider(PersonalInformation personalInformationOfRider) {
        PersonalInformationOfRider = personalInformationOfRider;
    }

    public WorkingBook getWorkingBook() {
        return workingBook;
    }

    public void setWorkingBook(WorkingBook workingBook) {
        this.workingBook = workingBook;
    }

    public LocalDateTime getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDateTime startDay) {
        this.startDay = startDay;
    }

    public LocalDateTime getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDateTime endDay) {
        this.endDay = endDay;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver driver)) return false;
        return Objects.equals(getId(), driver.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
