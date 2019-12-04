package com.lpr.factory.method;

public class BMW320Factory extends Factory {


    @Override
    public void createBMW() {

        BMW320 bmw320=new BMW320();
        bmw320.create();

    }
}
