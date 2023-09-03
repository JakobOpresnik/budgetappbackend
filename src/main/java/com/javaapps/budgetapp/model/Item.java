package com.javaapps.budgetapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item {
    @Id // makes id primary key in database
    @GeneratedValue(strategy = GenerationType.IDENTITY) // makes id auto incremented
    private int id;
    private String name;
    private double price;
    private ItemType type;

    public Item() {
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ItemType getType() {
        return type;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(ItemType type) {
        this.type = type;
    }
}
