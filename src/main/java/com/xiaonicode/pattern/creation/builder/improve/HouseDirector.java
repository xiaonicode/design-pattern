package com.xiaonicode.pattern.creation.builder.improve;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/14 14:26
 * @description: 指挥者, 指定制作流程
 */
public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /** 如何处理建造房子的过程, 交给指挥者 */
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

}
