package com.xiaonicode.pattern.creation.builder.improve;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/14 13:13
 * @description:
 */
public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子封顶");
    }

}
