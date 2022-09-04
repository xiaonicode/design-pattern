package com.xiaonicode.principle.singleresponsibility.follow;

import org.junit.Test;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/03 16:46
 * @description: 遵循单一职责原则
 */
public class FollowTest {

    /**
     * 方案 2: 根据交通工具运行方法的不同, 分解成不同的类即可, 遵循单一职责原则,<br/>
     * 但是改动很大, 即要将类进行分解, 同时还要修改客户端.
     */
    @Test
    public void test1() {
        RoadVehicle rv = new RoadVehicle();
        rv.run("汽车");

        AirVehicle av = new AirVehicle();
        av.run("飞机");

        WaterVehicle wv = new WaterVehicle();
        wv.run("轮船");
    }

    /**
     * 方案 3: 直接修改 Vehicle 类, 改动的代码会比较少.<br/>
     * 这种方案修改方法没有对原来的类做过多的修改, 只是增加方法,<br/>
     * 在一定程度上, 没有在类级别上遵守单一职责原则, 只是在方法级别上遵守了单一职责原则.
     */
    @Test
    public void test2() {
        Vehicle v = new Vehicle();
        v.runAir("飞机");
        v.runRoad("汽车");
        v.runWater("轮船");
    }

}
