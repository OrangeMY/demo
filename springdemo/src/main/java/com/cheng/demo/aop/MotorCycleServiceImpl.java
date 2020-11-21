package com.cheng.demo.aop;

public class MotorCycleServiceImpl implements MotorCycleService {
    @Override
    public void ride() {
        System.out.println("骑起来很爽，很自由");
    }

    @Override
    public void refit() {
        System.out.println("改装了很帅");
    }
}
