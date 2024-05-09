package com.application.springbootmongodemo.controller;

import java.util.List;
import com.application.springbootmongodemo.dto.CreateCarRequestDto;
import com.application.springbootmongodemo.model.Car;
import com.application.springbootmongodemo.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @PostMapping
    public Car saveCar(@RequestBody CreateCarRequestDto requestDto) {
        return carService.saveCar(requestDto);
    }

    @GetMapping
    public List<Car> getCars() {
        return carService.getCars();
    }

    @GetMapping("/find-by-manufacturer")
    public List<Car> getCarsByManufacturer(@RequestParam String manufacturer) {
        return carService.getCarsByManufacturer(manufacturer);
    }

    @GetMapping("/find-by-year")
    public List<Car> getCarsOlderThan(@RequestParam int year) {
        return carService.getCarsOlderThan(year);
    }
}
