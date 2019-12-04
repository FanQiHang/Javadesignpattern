package com.lpr.dynamicproxypattern;


import java.lang.reflect.Proxy;

public class Customer {

    public static void main(String[] args) {
        Host host = new Host();

        //相当于成立了代理公司，一个员工对应一个客户
        Employee emp = new Employee();
        emp.setHost(host);

        Rent proxy = (Rent) Proxy.newProxyInstance(Customer.class.getClassLoader(), new Class<?>[]{Rent.class}, emp);
        proxy.rent(3000);
    }
}
