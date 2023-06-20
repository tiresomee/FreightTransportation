package com.example.freighttransportation.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class PlaceOfWork {
    private String companyName;
    private LocalDateTime workStart;
    private LocalDateTime workEnd;

    public PlaceOfWork(String companyName, LocalDateTime workStart, LocalDateTime workEnd) {
        this.companyName = companyName;
        this.workStart = workStart;
        this.workEnd = workEnd;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public LocalDateTime getWorkStart() {
        return workStart;
    }

    public void setWorkStart(LocalDateTime workStart) {
        this.workStart = workStart;
    }

    public LocalDateTime getWorkEnd() {
        return workEnd;
    }

    public void setWorkEnd(LocalDateTime workEnd) {
        this.workEnd = workEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlaceOfWork that)) return false;
        return Objects.equals(getCompanyName(), that.getCompanyName()) && Objects.equals(getWorkStart(),
                that.getWorkStart()) && Objects.equals(getWorkEnd(), that.getWorkEnd());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCompanyName(), getWorkStart(), getWorkEnd());
    }

    @Override
    public String toString() {
        return "PlaceOfWork{" +
                "companyName='" + companyName + '\'' +
                ", workStart=" + workStart +
                ", workEnd=" + workEnd +
                '}';
    }
}
