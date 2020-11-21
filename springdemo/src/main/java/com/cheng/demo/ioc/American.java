package com.cheng.demo.ioc;

/**
 * 定义美国人类，用来学习通过构造方法注入
 */
class American implements Person {

    private Axe axe;

    public American() {

    }

    public American(Axe axe) {
        this.axe = axe;
    }

    @Override
    public void useAxe() {
        System.out.println(axe.chop());
    }
}
