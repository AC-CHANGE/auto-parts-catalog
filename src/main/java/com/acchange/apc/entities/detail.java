package com.acchange.apc.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Detail {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String article;

    private Double price;

    @ManyToMany(mappedBy = "details")
    private List<Car> cars;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
