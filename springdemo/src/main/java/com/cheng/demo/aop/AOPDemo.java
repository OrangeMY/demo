package com.cheng.demo.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 这个类主要用于测试AOP的功能，
 * 主要有两种方式实现AOP
 *  第一种：基于配置文件的方式，Bike这一系列都是采用配置文件方式
 *  第二种：基于注解的方式，User这一系列都是采用注解方式
 */
public class AOPDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop-config.xml");
        UserService userService = (UserService) context.getBean("userService");
        System.out.println("========注解方式=========");
        System.out.println("=====这是后置通知-=========");
        userService.eat();
        System.out.println("=====这是前置通知-=========");
        userService.play();
        System.out.println("========配置文件方式=========");
        MotorCycleService motorCycleService = (MotorCycleService) context.getBean("motorCycleService");
        motorCycleService.ride();
    }
}
