package com.lpr.staticproxypattern;

public class Customer {

    public static void main(String[] args) {
        //客户和中介谈
        Proxy proxy = new Proxy();
        proxy.rent(3000);
    }
}
