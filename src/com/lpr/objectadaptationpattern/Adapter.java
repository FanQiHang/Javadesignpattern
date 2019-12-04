package com.lpr.objectadaptationpattern;

public class Adapter implements Target {

    private ChildAdaptee adaptee;

    // 有参构造
    public Adapter(ChildAdaptee adaptee) {
        this.adaptee =adaptee;
    }

    @Override
    public void method1() {
        adaptee.method1(); // 继承自父类中的方法
    }

    @Override
    public void method2() {
        System.out.println("method 2");
    }

    @Override
    public void method3() {
        adaptee.method3();
    }


}
