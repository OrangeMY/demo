package com.cheng.demo.ioc;

/**
 * 定义中国人类，用来学习使用setter方法注入
 */
class Chinese implements Person {
    // 面向接口编程，定义一个斧子的接口
    private Axe axe;

    public Chinese() {

    }

    @Override
    public void useAxe() {
        System.out.println(axe.chop());
    }

    public Axe getAxe() {
        return axe;
    }

    // 用于依赖注入
    public void setAxe(Axe axe) {
        this.axe = axe;
    }
}
