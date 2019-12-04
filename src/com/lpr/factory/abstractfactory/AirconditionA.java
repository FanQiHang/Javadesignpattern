package com.lpr.factory.abstractfactory;

public class AirconditionA implements Aircondition {
    @Override
    public void create() {
        System.out.println("生产一个A型空调");
    }
}
