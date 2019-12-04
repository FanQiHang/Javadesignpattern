package com.lpr.staticproxypattern;

public class Proxy implements Rent {

    //只有代理（中介）可以和房东联系
    private Host host=new Host();

    @Override
    public Object rent(Object money) {
        time();
        return host.rent(money);
    }

    // 代理替房东做的一些事情
    public void time(){
        System.out.println("约了10点去看房子");
    }
}
