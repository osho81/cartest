package com.osho.cartest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    // Fields/columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "regnr", nullable = false)
    private String regNr;

    @Column(name = "model")
    private String model; // BMW, Audi etc.

    @Column(name = "model_year")
    private int modelYear;

    @Column(name = "daily_sek")
    private double dailySek;

    public Car() {
    }
    public Car(String regNr, String model, int modelYear, double dailySek) {
        this.regNr = regNr;
        this.model = model;
        this.modelYear = modelYear;
        this.dailySek = dailySek;
    }

    // Removed for Gcloud sql
    public int getId() {
        return id;
    }

    // Removed for Gcloud sql
    public void setId(int id) {
        this.id = id;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public double getDailySek() {
        return dailySek;
    }

    public void setDailySek(double dailySek) {
        this.dailySek = dailySek;
    }
}
