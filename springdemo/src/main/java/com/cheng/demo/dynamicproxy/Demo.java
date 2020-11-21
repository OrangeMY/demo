package com.cheng.demo.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 这个类主要用于实现一下动态代理，这是测试代理的效果
 */
public class Demo {

    public static void main(String[] args) {
        Bike bike = new Bike("MERIDA", "BLUE");
        Class bikeClazz = bike.getClass();
        ClassLoader classLoader = bikeClazz.getClassLoader();
        Class[] interfaces = bikeClazz.getInterfaces();
        MyInvocationHandler invocationHandler = new MyInvocationHandler(bike);
        Transport transport = (Transport) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        transport.ride();
    }
}
