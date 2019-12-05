package com.lpr.prototypepattern.deepclone;

/**
 * https://www.jianshu.com/p/a01a4fdae728
 **/
public class Client {
    public static void main(String[] args) {
        Area area = new Area();
        area.setUnit("人民币");

        Money money = new Money(100, area);

        try {
            Money cloneMoney = money.clone();
            cloneMoney.setFaceValue(200);
            area.setUnit("美元");

            System.out.println("这张是" + money.getFaceValue() + money.getArea().getUnit() + "的钞票");

            System.out.println("这张是" + cloneMoney.getFaceValue() + cloneMoney.getArea().getUnit() + "的钞票");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
