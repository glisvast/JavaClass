package org.dimigo.oop;

public class Car2 {

    //Field
    private String company;
    private String model;
    private String color;
    private int maxSpeed;
    private int price;

    public Car2 () {

    }

    public Car2(String company, String model, String color, int maxSpeed, int price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public Car2(String company, String model, String color, int maxSpeed) {
        this(company, model, color, maxSpeed, 0);
    }

    public Car2(String company, String model, String color) {
        this(company, model, color, 0);
    }

    //Method

    public String getCompany() {
        return company;
    }

    public void setcompany(String company) {
        company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}