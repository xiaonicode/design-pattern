package com.xiaonicode.pattern.creation.singleton.type5;

import org.junit.Test;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 16:01
 * @description: 饿汉式 (线程安全, 同步代码块) 测试
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
