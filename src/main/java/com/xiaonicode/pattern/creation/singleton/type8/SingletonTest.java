package com.xiaonicode.pattern.creation.singleton.type8;

import org.junit.Test;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 17:24
 * @description: 枚举测试
 */
public class SingletonTest {

    @Test
    public void test1() {
        new Thread(() -> {
            Singleton instance = Singleton.INSTANCE;
            System.out.println(Thread.currentThread().getName() + " instance: " + instance + " hashcode: " + instance.hashCode());
            instance.sayOk();
        }, "t1").start();

        new Thread(() -> {
            Singleton instance = Singleton.INSTANCE;
            System.out.println(Thread.currentThread().getName() + " instance: " + instance + " hashcode: " + instance.hashCode());
            instance.sayOk();
        }, "t2").start();
    }

}
