package com.lpr.bulider;

public class Test {

    public static void main(String[] args) {
        House house = new Builder().build(new BuildHouse());
        System.out.println(house); // toString方法
    }
}
