package com.acchange.apc.services;

import com.acchange.apc.entities.Car;
import com.acchange.apc.entities.Detail;
import com.acchange.apc.entities.User;
import com.acchange.apc.repositories.CarRepository;
import com.acchange.apc.repositories.DetailRepository;
import com.acchange.apc.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DetailRepository detailRepository;

    @Autowired
    private CarRepository carRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findOne(int id) {
        return userRepository.findOne(id);
    }

    @Transactional
    public User findOneWithCars(int id) {
        User user = findOne(id);
        List<Car> cars = carRepository.findByUser(user);
            for(Car car : cars){
                List<Detail> details = detailRepository.findByCar(car);
                car.setDetails(details);
            }
        user.setCars(cars);
        return user;
    }
}
