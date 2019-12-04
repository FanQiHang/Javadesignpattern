package com.lpr.staticproxypattern;

public class Host implements Rent {
    @Override
    public Object rent(Object money) {
        System.out.println("真实对象（房东）房屋出租成功,"+money);
        return new Object();
    }
}
