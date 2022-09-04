package com.xiaonicode.principle.liskovsubstitution.follow;

import org.junit.Test;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 17:34
 * @description: 遵循里氏替换原则
 */
public class FollowTest {

    @Test
    public void test1() {
        Calculation1 c1 = new Calculation1();
        System.out.println("11 - 3 = " + c1.func1(11, 3)); // 8
        System.out.println("1 - 8 = " + c1.func1(1, 8)); // -7

        System.out.println("=============================== ");

        Calculation2 c2 = new Calculation2();
        // Calculation2 类不再继承 Calculation1 类, func1 不再是求减法
        // 调用完成的功能就更加明确
        System.out.println("11 + 3 = " + c2.func1(11, 3)); // 14
        System.out.println("1 + 8 = " + c2.func1(1, 8)); // 9
        System.out.println("11 + 3 + 9 = " + c2.func2(11, 3)); // 23

        System.out.println("=============================== ");

        // 使用组合仍然可以使用到 Calculation1 类的求减法的方法
        System.out.println("11 - 3 = " + c2.func3(11, 3)); // 8
    }

}
