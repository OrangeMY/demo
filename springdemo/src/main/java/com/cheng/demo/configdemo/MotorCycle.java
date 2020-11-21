package com.cheng.demo.configdemo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 一会对这个摩托车类在配置文件中进行配置
 */
class MotorCycle {
    // 第一类：基本类和String类
    private String name;
    private Integer weight;
    // 第二类：引用类
    private Brand brand;
    // 第三类：集合类
    private Map maps;
    private Set sets;
    private List lists;
    private Properties properties;

    public MotorCycle() {

    }

    public MotorCycle(String name, Integer weight, Brand brand) {
        this.name = name;
        this.weight = weight;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Map getMaps() {
        return maps;
    }

    public void setMaps(Map maps) {
        this.maps = maps;
    }

    public Set getSets() {
        return sets;
    }

    public void setSets(Set sets) {
        this.sets = sets;
    }

    public List getLists() {
        return lists;
    }

    public void setLists(List lists) {
        this.lists = lists;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", brand=" + brand +
                ", maps=" + maps +
                ", sets=" + sets +
                ", lists=" + lists +
                ", properties=" + properties +
                '}';
    }
}
