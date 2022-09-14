package com.xiaonicode.pattern.creation.builder.traditionalway;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/14 13:13
 * @description: 普通房子
 */
public class CommonHouse extends BaseHouse {

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
