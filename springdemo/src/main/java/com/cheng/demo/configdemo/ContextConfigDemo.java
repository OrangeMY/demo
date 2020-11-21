package com.cheng.demo.configdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 这个类主要是用来学习，applicationContext文件中的bean属性是怎么进行配置的
 */
public class ContextConfigDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
        MotorCycle motorCycle = (MotorCycle) context.getBean("motorCycle");
        System.out.println(motorCycle);
    }
}

