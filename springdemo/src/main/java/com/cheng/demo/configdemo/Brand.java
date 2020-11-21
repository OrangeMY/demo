package com.cheng.demo.configdemo;

/**
 * 摩托车品牌类，主要用于在摩托车类中引用的配置
 */
class Brand {
    private String name;

    public Brand() {

    }

    public Brand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                '}';
    }
}
