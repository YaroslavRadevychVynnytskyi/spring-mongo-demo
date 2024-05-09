package com.application.springbootmongodemo.service.impl;

import java.util.List;
import com.application.springbootmongodemo.dto.CreateCarRequestDto;
import com.application.springbootmongodemo.model.Car;
import com.application.springbootmongodemo.repository.CarRepository;
import com.application.springbootmongodemo.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Override
    public Car saveCar(CreateCarRequestDto requestDto) {
        Car car = new Car(
                requestDto.manufacturer(),
                requestDto.model(),
                requestDto.year(),
                false
        );
        return carRepository.save(car);
    }

    @Override
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @Override
    public List<Car> getCarsByManufacturer(String manufacturer) {
        return carRepository.findByManufacturer(manufacturer);
    }

    @Override
    public List<Car> getCarsOlderThan(int year) {
        return carRepository.findCarsOlderThan(year);
    }
}
