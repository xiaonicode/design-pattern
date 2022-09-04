package com.xiaonicode.principle.demeter.violate;

import org.junit.Test;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 20:23
 * @description: 违反迪米特法则 (最小知道原则)
 */
public class ViolateTest {

    @Test
    public void test1() {
        SchoolManager sm = new SchoolManager();
        sm.printAllEmployees(new CollegeManager());
    }

}
