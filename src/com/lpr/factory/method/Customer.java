package com.lpr.factory.method;


/**
 * 个人理解：当有系列的产品被设计出，重新开设一家工厂
 * **/
public class Customer {

    public static void main(String[] args) {
        BMW523Factory bmw523Factory=new BMW523Factory();
        bmw523Factory.createBMW();

        BMW320Factory bmw320Factory=new BMW320Factory();
        bmw320Factory.createBMW();
    }
}
