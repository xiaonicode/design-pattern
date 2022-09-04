package com.xiaonicode.principle.dependenceinversion.violate;

import org.junit.Test;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 13:58
 * @description: 违反依赖倒转 (倒置) 原则
 */
public class ViolateTest {

    @Test
    public void test1() {
        Person p = new Person();
        p.receive(new Email());
    }

}
