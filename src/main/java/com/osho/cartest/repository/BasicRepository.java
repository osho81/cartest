package com.osho.cartest.repository;

import com.osho.cartest.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicRepository extends JpaRepository<Car, Integer>{

}
