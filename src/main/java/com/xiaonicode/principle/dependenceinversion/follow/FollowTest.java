package com.xiaonicode.principle.dependenceinversion.follow;

import org.junit.Test;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 13:58
 * @description: 遵循依赖倒转 (倒置) 原则
 */
public class FollowTest {

    @Test
    public void test1() {
        Person p = new Person();
        p.receive(new Email());
        p.receive(new Wechat());
    }

}
