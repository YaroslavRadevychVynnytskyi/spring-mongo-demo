package com.application.springbootmongodemo.service;

import java.util.List;
import com.application.springbootmongodemo.dto.CreateCarRequestDto;
import com.application.springbootmongodemo.model.Car;

public interface CarService {
    Car saveCar(CreateCarRequestDto requestDto);

    List<Car> getCars();

    List<Car> getCarsByManufacturer(String manufacturer);

    List<Car> getCarsOlderThan(int year);
}
