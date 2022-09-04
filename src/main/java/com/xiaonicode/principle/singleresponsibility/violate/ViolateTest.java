package com.xiaonicode.principle.singleresponsibility.violate;

import org.junit.Test;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/03 16:46
 * @description: 违反单一职责原则
 */
public class ViolateTest {

    @Test
    public void test1() {
        Vehicle v = new Vehicle();
        v.run("摩托车");
        v.run("汽车");
        v.run("飞机");
    }

}
