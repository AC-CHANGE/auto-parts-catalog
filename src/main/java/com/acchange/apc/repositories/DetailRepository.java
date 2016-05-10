package com.acchange.apc.repositories;

import com.acchange.apc.entities.Car;
import com.acchange.apc.entities.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetailRepository extends JpaRepository<Detail, Integer> {

    List<Detail> findByCar(Car car);
}
