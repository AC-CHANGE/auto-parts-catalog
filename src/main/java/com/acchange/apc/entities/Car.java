package com.acchange.apc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private Integer id;

    private String mark;

    private String model;

    private Integer year;
    @ManyToMany
    private List<Detail> Details;

    public List<Detail> getDetails() {
        return Details;
    }

    public void setDetails(List<Detail> details) {
        Details = details;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
