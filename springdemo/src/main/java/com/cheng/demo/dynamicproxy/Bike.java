package com.cheng.demo.dynamicproxy;

/**
 * 自行车，需要被增强的类
 */
public class Bike implements Transport {

    private String brand;

    private String color;

    public Bike() {

    }

    public Bike(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public void ride() {
        System.out.println("自行车的速度好慢啊");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
