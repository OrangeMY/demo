package com.cheng.demo.aop;

import org.springframework.stereotype.Component;

@Component(value = "userService")
public class UserServiceImpl implements UserService {
    @Override
    public void eat() {
        System.out.println("吃好吃的");
    }

    @Override
    public void play() {
        System.out.println("玩好玩的");
    }
}
