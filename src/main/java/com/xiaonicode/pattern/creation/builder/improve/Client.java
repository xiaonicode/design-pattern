package com.xiaonicode.pattern.creation.builder.improve;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/14 13:16
 * @description: 客户端
 */
public class Client {

    public static void main(String[] args) {
        // 该普通房子
        CommonHouse commonHouse = new CommonHouse();
        // 准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        // 完成盖房
        House house = houseDirector.constructHouse();

        System.out.println("==================================");

        HighBuilding highBuilding = new HighBuilding();
        houseDirector.setHouseBuilder(highBuilding);
        House house1 = houseDirector.constructHouse();
    }

}
