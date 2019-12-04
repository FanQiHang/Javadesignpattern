package com.lpr.factory.abstractfactory;

/**
 * 个人理解：不仅开设了分厂，而且分厂都能够制造多种零件
 * **/
public class Customer {

    public static void main(String[] args) {
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();

        //生产宝马523系列配件
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW523.createEngine();
        factoryBMW523.createAircondition();
    }
}
