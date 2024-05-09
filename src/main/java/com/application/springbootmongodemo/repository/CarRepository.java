package com.application.springbootmongodemo.repository;

import java.util.List;
import com.application.springbootmongodemo.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CarRepository extends MongoRepository<Car, String> {
    List<Car> findByManufacturer(String manufacturer);

    @Query("{'year':{$lt: ?0}}")
    List<Car> findCarsOlderThan(int year);
}
