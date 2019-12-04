package com.lpr.factory.simple;

public class Factory {


    public void createBMW(int type) {
        switch (type) {

            case 320:
                BMW320 bmw320= new BMW320();
                bmw320.create();
                break;

            case 523:
                BMW523 bmw523= new BMW523();
                bmw523.create();
                break;

            default:
                break;
        }
    }


}
