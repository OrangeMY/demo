package com.cheng.demo.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-life-cycle.xml");
        Student stu = (Student) context.getBean("student");
        stu.play();
        System.out.println(stu);
        ((AbstractApplicationContext) context).close();
    }
}
