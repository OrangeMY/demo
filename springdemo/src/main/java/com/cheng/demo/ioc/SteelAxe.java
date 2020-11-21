package com.cheng.demo.ioc;

/**
 * 铁斧子
 */
class SteelAxe implements Axe {

    public SteelAxe() {

    }

    @Override
    public String chop() {
        return "铁斧子砍的好快啊";
    }
}
