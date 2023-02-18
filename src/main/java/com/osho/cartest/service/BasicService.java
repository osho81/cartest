package com.osho.cartest.service;

import com.osho.cartest.model.Car;
import com.osho.cartest.repository.BasicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BasicService {

    @Autowired
    private BasicRepository basicRepository;

    public Car addCar(Car car) {
        return basicRepository.save(car);
    }
}
