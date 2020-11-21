package com.cheng.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // 声明这是一个切面类
@Component // 声明这是一个组建，让IOC容器进行管理
public class UserAspects {

    @Pointcut(value="execution(public void com.cheng.demo.aop.UserServiceImpl.eat(..))")
    public void pointCut(){}

    @Pointcut(value="execution(* com.cheng.demo.aop.UserServiceImpl.play())")
    public void pointCut2(){}

    @Before(value = "pointCut2()")
    public void prepare() {
        System.out.println("运动前换好装备");
    }

    @After(value="pointCut()")
    public void addThings() {
        System.out.println("清理干净");
    }
}
