package com.cheng.demo.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 这个类主要是学习Spring中IOC的思想。
 * 假如要实现一个人用斧子砍东西，利用Spring的思想来实现
 */
public class IOCDemo {

    public static void main(String[] args) {
        // 采用两种方法，
        // 第一种使用传统的面向接口的方法实现
        // 第二种使用spring容器，依赖注入实现，看看他们两的区别

        // 第一种
        Chinese chinese = new Chinese();
        Axe axe = new StoneAxe();
        chinese.setAxe(axe);
        chinese.useAxe();
        // 第二种
        System.out.println("=======下面是通过配置文件，通过setter依赖注入的方式实现=======");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc-config.xml");
        Person person = (Chinese) context.getBean("chinese");
        person.useAxe();
        // 第三种
        System.out.println("=======下面是通过配置文件，通过构造函数依赖注入的方式实现=======");
        Person person2 = (Person) context.getBean("american");
        person2.useAxe();
    }
}

