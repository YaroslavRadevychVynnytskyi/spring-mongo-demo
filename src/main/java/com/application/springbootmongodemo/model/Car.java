package com.application.springbootmongodemo.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "cars")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Car {
    @MongoId
    private String id;
    private String manufacturer;
    private String model;
    private int year;
    private boolean booked;

    public Car(String manufacturer, String model, int year, boolean booked) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.booked = booked;
    }
}
