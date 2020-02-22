package com.example.anotherspringboot.repository;

import com.example.anotherspringboot.domain.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
