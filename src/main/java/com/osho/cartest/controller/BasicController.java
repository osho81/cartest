package com.osho.cartest.controller;

import com.osho.cartest.model.Car;
import com.osho.cartest.repository.BasicRepository;
import com.osho.cartest.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "*")
public class BasicController {

    @Autowired
    private BasicRepository basicRepository;

    @Autowired
    private BasicService basicService;

    @GetMapping("/")
    public String sayHello() {
        return "<h1 style=\"color:blue;\">Hellooooo<h1>"; // Interpreted by browser
    }

    @GetMapping("/bye")
    public String sayGoodBye() {
        return "<h1 style=\"color:red;\">Good Bye<h1>"; // Interpreted by browser
    }

    @PostMapping("/addcar")
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        return new ResponseEntity<Car>(basicService.addCar(car), HttpStatus.CREATED);
    }


}
