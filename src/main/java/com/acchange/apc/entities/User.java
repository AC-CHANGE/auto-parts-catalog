package com.acchange.apc.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String password;

    @ManyToMany
    @JoinTable
    List<Role> roles;

    @ManyToOne
    @JoinColumn(name = "pricePolitic_id")
    private PricePolitic pricePolitic;

    @OneToMany(mappedBy = "user")
    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public PricePolitic getPricePolitic() {
        return pricePolitic;
    }

    public void setPricePolitic(PricePolitic pricePolitic) {
        this.pricePolitic = pricePolitic;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

