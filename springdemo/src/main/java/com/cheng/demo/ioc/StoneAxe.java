package com.cheng.demo.ioc;

/**
 * 石头斧子
 */
class StoneAxe implements Axe {

    public StoneAxe() {

    }

    @Override
    public String chop() {
        return "石头斧子砍的好慢";
    }
}
