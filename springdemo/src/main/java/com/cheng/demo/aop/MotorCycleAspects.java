package com.cheng.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MotorCycleAspects {

    public void aroundAdvice(ProceedingJoinPoint jpt) {
        System.out.println("骑车前要带好头盔");
        try {
            jpt.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("骑完车要回家");
    }
}
