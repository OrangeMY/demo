package com.cheng.demo.beanlifecycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class Student implements BeanNameAware {
    private String name;
    private Integer age;

    public Student() {

    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void play() {
        System.out.println("调用Student本身的业务方法");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("调用BeanNameAware的setBeanName方法");
    }

    public void initMethod() {
        System.out.println("调用Student类中自定义的initMethod方法");
    }

    public void destroyMethod() {
        System.out.println("调用Student类中的自定义的destroyMethod方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("设置对象属性，name属性");
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.out.println("设置对象属性，age属性");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
