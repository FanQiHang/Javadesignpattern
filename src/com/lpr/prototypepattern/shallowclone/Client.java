package com.lpr.prototypepattern.shallowclone;

public class Client {
    public static void main(String[] args) {
        Area area = new Area();
        area.setUnit("人民币");

        Money money = new Money(100, area);

        try {
            Money cloneMoney = money.clone();
//            cloneMoney.setFaceValue(200);
            money.setFaceValue(2000); // String类型和基本数值类型，不会影响克隆后的值
            area.setUnit("美元"); //原型实例更改为美元，拷贝实例也随之更改，即浅拷贝

            System.out.println("这张是" + money.getFaceValue() + money.getArea().getUnit() + "的钞票");

            System.out.println("这张是" + cloneMoney.getFaceValue() + cloneMoney.getArea().getUnit() + "的钞票");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
