package com.lpr.factory.simple;


/**
 * 个人理解：如果有新系列的宝马车被设计出，需要Factory中配置新的设备
 * **/
public class Customer {

    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.createBMW(320);
        factory.createBMW(523);
    }

}
