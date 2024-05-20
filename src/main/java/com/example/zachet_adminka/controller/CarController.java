package com.example.zachet_adminka.controller;

import org.springframework.web.bind.annotation.*;
import com.example.zachet_adminka.model.Car;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/cars")
public class CarController {
    @GetMapping("/get_all_cars")
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car(1, "BMW", "M4");
        Car car2 = new Car(2, "Ford","Mustang");
        cars.add(car1);
        cars.add(car2);
        return cars;
    }

}
