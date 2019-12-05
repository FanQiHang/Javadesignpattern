package com.lpr.prototypepattern.deepclone;

import java.io.Serializable;

public class Money implements Cloneable , Serializable {

    private int faceValue;

    private Area area;

    public Money(int faceValue, Area area) {
        this.faceValue = faceValue;
        this.area = area;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Override
    protected Money clone() throws CloneNotSupportedException {
        Money cloneMoney = (Money) super.clone();
        cloneMoney.area = (Area) this.area.clone();
        return cloneMoney;
    }

}
