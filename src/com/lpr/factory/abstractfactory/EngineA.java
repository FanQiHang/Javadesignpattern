package com.lpr.factory.abstractfactory;

public class EngineA implements Engine {
    @Override
    public void create() {
        System.out.println("生产一个A型引擎");
    }
}
