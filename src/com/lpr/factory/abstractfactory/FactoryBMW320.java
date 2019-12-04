package com.lpr.factory.abstractfactory;

public class FactoryBMW320 implements AbstractFactory {
    @Override
    public void createEngine() {
        EngineA engineA=new EngineA();
        engineA.create();
    }

    @Override
    public void createAircondition() {

        AirconditionA airconditionA=new AirconditionA();
        airconditionA.create();

    }
}
