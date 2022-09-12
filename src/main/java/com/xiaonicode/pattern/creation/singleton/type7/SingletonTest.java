package com.xiaonicode.pattern.creation.singleton.type7;

import org.junit.Test;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 17:24
 * @description: 静态内部类测试
 */
public class SingletonTest {

    @Test
    public void test1() {
        new Thread(() -> {
            Singleton instance = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " instance: " + instance);
        }, "t1").start();

        new Thread(() -> {
            Singleton instance = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " instance: " + instance);
        }, "t2").start();
    }

}
