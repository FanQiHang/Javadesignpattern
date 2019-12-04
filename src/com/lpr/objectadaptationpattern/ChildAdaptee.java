package com.lpr.objectadaptationpattern;

public class ChildAdaptee extends Adaptee {

    public void method3(){
        System.out.println("method 3");
    }

    @Override
    public void method1() {
        System.out.println("method 1 child");
    }
}
