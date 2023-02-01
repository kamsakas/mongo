package com.db.mongo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Products")
public class product {
    private String name;
    private int sales;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public product() {
    }

    @Override
    public String toString() {
        return "product{" +
                "name='" + name + '\'' +
                ", sales=" + sales +
                '}';
    }

    public product(String name) {
        this.name = name;
    }
}
