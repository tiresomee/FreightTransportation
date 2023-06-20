package com.example.freighttransportation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class WorkingBook {
    @Id
    private String id;
    private String name;
    private String description;
    private String workingBookNumber;
    private List<PlaceOfWork> placesOfWorks;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public WorkingBook(String name, String description, String workingBookNumber, List<PlaceOfWork> placesOfWorks) {
        this.name = name;
        this.description = description;
        this.workingBookNumber = workingBookNumber;
        this.placesOfWorks = placesOfWorks;
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

    public String getWorkingBookNumber() {
        return workingBookNumber;
    }

    public void setWorkingBookNumber(String workingBookNumber) {
        this.workingBookNumber = workingBookNumber;
    }

    public List<PlaceOfWork> getPlacesOfWorks() {
        return placesOfWorks;
    }

    public void setPlacesOfWorks(List<PlaceOfWork> placesOfWorks) {
        this.placesOfWorks = placesOfWorks;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkingBook that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
