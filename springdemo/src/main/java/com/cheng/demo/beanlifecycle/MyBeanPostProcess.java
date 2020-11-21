package com.cheng.demo.beanlifecycle;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Bean的后置处理器
 * postProcessBeforeInitialization：初始化之前对Bean进行增强处理
 * postProcessAfterInitialization：初始化之后对Bean进行增强处理
 */
public class MyBeanPostProcess implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("调用BeanPostProcess中的beforeInitialize方法，此时beanName:" + beanName + " 此时bean：" + bean);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) {
        Student s = null;
        System.out.print("调用BeanPostProcess中的afterInitialize方法，对他进行修改=====");
        if ("student".equals(beanName) || bean instanceof Student) {
            s = (Student) bean;
            s.setName("chengmingyang");
        }
        return s;
    }
}
