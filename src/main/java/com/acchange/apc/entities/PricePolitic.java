package com.acchange.apc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class PricePolitic {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer discount;

    @OneToMany(mappedBy = "pricePolitic")
    private List<User> Users;
}
