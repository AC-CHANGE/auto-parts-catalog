package com.acchange.apc.repositories;

import com.acchange.apc.entities.Car;
import com.acchange.apc.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository <Car,Integer>{
    List<Car> findByUser(User user);
}
