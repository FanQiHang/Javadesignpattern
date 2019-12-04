package com.lpr.observerpattern;



// 抽象被观察者接口
public interface Observed {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();
}
