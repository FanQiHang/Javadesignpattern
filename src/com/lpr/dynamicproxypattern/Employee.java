package com.lpr.dynamicproxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Employee implements InvocationHandler {

    private Rent host;

    public void setHost(Rent host) {
        this.host = host;
    }

    public Rent getHost() {
        return host;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnValue=method.invoke(host,args);
        return returnValue;
    }
}
