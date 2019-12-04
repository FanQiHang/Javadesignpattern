package com.lpr.factory.abstractfactory;

public class EngineB implements Engine {
    @Override
    public void create() {
        System.out.println("生产一个B型引擎");
    }
}
