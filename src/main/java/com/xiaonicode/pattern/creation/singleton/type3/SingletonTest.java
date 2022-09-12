package com.xiaonicode.pattern.creation.singleton.type3;

import org.junit.Test;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 16:01
 * @description: 懒汉式 (线程不安全) 测试
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

    @Test
    public void test2() {
        new Thread(() -> {
            Singleton instance = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " instance: " + instance); // t1 instance: ...Singleton@17b4e5a5
        }, "t1").start();

        new Thread(() -> {
            Singleton instance = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " instance: " + instance); // t2 instance: ...Singleton@52f9a80f
        }, "t2").start();
    }

}
