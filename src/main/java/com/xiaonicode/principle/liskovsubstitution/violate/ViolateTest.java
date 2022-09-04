package com.xiaonicode.principle.liskovsubstitution.violate;

import org.junit.Test;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 17:34
 * @description: 违反里氏替换原则
 */
public class ViolateTest {

    @Test
    public void test1() {
        Calculation1 c1 = new Calculation1();
        System.out.println("11 - 3 = " + c1.func1(11, 3)); // 8
        System.out.println("1 - 8 = " + c1.func1(1, 8)); // -7

        System.out.println("=============================== ");

        Calculation2 c2 = new Calculation2();
        System.out.println("11 - 3 = " + c2.func1(11, 3)); // 14
        System.out.println("1 - 8 = " + c2.func1(1, 8)); // 9
        System.out.println("11 + 3 + 9 = " + c2.func2(11, 3)); // 23
    }

}
