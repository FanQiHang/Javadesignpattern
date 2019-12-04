package com.lpr.objectadaptationpattern;

import com.lpr.objectadaptationpattern.Adapter;

public class Test {

    public static void main(String[] args) {
        Adapter adapter = new Adapter(new ChildAdaptee());
        adapter.method1();
        adapter.method2();
        adapter.method3();
    }
}
