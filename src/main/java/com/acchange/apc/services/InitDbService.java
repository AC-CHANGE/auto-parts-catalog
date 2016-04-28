package com.acchange.apc.services;

import com.acchange.apc.entities.*;
import com.acchange.apc.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class InitDbService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PricePoliticRepository pricePoliticRepository;

    @Autowired
    private DetailRepository detailRepository;

    @PostConstruct
    public void init(){
        Role roleAdmin = new Role();
        roleAdmin.setName("ROLE_ADMIN");
        roleRepository.save(roleAdmin);

        Role roleClient = new Role();
        roleClient.setName("ROLE_CLIENT");
        roleRepository.save(roleClient);

        Role roleManager = new Role();
        roleManager.setName("ROLE_MANAGER");
        roleRepository.save(roleManager);



        Car Bmw520e34 = new Car();
        Bmw520e34.setMark("BMW");
        Bmw520e34.setModel("5-series");
        Bmw520e34.setYear(1995);
        carRepository.save(Bmw520e34);

        Car MercedesE124 = new Car();
        Bmw520e34.setMark("Mercedes");
        Bmw520e34.setModel("E-class");
        Bmw520e34.setYear(1993);
        carRepository.save(MercedesE124);

        Detail detail1 = new Detail();
        detail1.setName("engine");
        detail1.setArticle("m50b20");
        List<Car> cars1 = new ArrayList<Car>();
        cars1.add(Bmw520e34);
        detail1.setCars(cars1);
        detail1.setPrice(2000d);
        detailRepository.save(detail1);

        Detail detail2 = new Detail();
        detail2.setName("wheel");
        detail2.setArticle("5x120_72.6");
        detail2.setPrice(30d);
        List<Car> cars2 = new ArrayList<Car>();
        cars2.add(Bmw520e34);
        cars2.add(MercedesE124);
        detail2.setCars(cars2);
        detailRepository.save(detail2);


        User userAdmin = new User();
        userAdmin.setName("admin");
        List<Role> roles = new ArrayList<Role>();
        roles.add(roleAdmin);
        roles.add(roleClient);
        roles.add(roleManager);
        userAdmin.setRoles(roles);
        userAdmin.setCars(carRepository.findAll());
        userRepository.save(userAdmin);


    }

}
