package com.lpr.factory.abstractfactory;

public class FactoryBMW523 implements AbstractFactory {
    @Override
    public void createEngine() {
        EngineB engineB = new EngineB();
        engineB.create();
    }

    @Override
    public void createAircondition() {

        AirconditionB airconditionB = new AirconditionB();
        airconditionB.create();

    }
}
