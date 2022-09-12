package com.xiaonicode.pattern.creation.singleton.type2;

import org.junit.Test;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 16:01
 * @description: 饿汉式 (静态代码块) 测试
 */
public class SingletonTest {

    @Test
    public void test1() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = " + instance1.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
    }

}
