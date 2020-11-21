package com.cheng.demo.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 生成自己的InvocationHandler类，主要用于处理，
 */
public class MyInvocationHandler implements InvocationHandler {

    Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object o = method.invoke(object, args);
        System.out.println("加个加速器");
        return o;
    }
}
