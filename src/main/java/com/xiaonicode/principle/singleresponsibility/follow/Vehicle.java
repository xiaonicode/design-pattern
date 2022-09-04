package com.xiaonicode.principle.singleresponsibility.follow;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/03 17:22
 * @description: 交通工具类
 */
public class Vehicle {

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在空中运行......");
    }

    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在路上运行......");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中运行......");
    }

}
