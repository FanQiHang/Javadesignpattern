package com.lpr.classadaptationpattern;

public class Adapter extends Adaptee implements Target {
    @Override
    public void method2() {
        System.out.println("method 2");
    }
}
