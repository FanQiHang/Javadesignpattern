package com.lpr.factory.abstractfactory;

public class AirconditionB implements Aircondition {
    @Override
    public void create() {
        System.out.println("生产一个B型空调");
    }
}
