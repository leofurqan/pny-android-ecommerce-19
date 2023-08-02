package com.example.myapplication.data;

import java.io.Serializable;

public class ProductsData implements Serializable {
    private int id;
    private String name, price, image, brand_name;

    public ProductsData(int id, String name, String price, String image, String brand_name) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.brand_name = brand_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }
}
