package com.xiaonicode.pattern.creation.builder.improve;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/14 13:13
 * @description:
 */
public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("给高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给高楼封顶");
    }

}
