package com.acchange.apc.repositories;

import com.acchange.apc.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository <Car,Integer>{
}
