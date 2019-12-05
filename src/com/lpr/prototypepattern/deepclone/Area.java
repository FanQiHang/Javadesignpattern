package com.lpr.prototypepattern.deepclone;

public class Area implements Cloneable {

    private String unit;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException { // 实现深拷贝
        Area cloneArea;
        cloneArea = (Area) super.clone();
        return cloneArea;
    }
}
