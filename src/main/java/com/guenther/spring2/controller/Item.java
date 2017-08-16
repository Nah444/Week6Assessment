package com.guenther.spring2.controller;

public class Item {

    private String name;
    private String description;
    private int quantity;
    private float price;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }


    public Item(String name, String description, int quantity, float price) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public Item() {
        name = "";
        description = "";
        quantity = 0;
        price = 0;
    }

}
