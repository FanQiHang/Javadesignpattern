package com.lpr.bulider;

public class Builder { //指挥者

    public House build(IBuildHouse buildHouse) {
        buildHouse.buildBasic();
        buildHouse.buildWall();
        buildHouse.buildRoof();
        return buildHouse.create();
    }
}
