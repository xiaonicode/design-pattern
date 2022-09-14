package com.xiaonicode.pattern.creation.builder.traditionalway;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/14 13:16
 * @description: 客户端
 */
public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();

        System.out.println("==================================");

        HighBuilding highBuilding = new HighBuilding();
        highBuilding.build();
    }

}
