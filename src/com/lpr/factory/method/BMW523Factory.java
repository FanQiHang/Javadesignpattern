package com.lpr.factory.method;

public class BMW523Factory extends Factory {

    @Override
    public void createBMW() {
        BMW523 bmw523 = new BMW523();
        bmw523.create();
    }
}
