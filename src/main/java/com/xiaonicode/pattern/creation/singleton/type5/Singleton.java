package com.xiaonicode.pattern.creation.singleton.type5;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 16:43
 * @description: 懒汉式 (线程安全, 同步代码块)<br/>
 * 1. 该方式本意是想解决同步方法效率低的问题, 改为同步产生实例化的代码块.
 * 但是该同步方式并不能起到线程同步的作用, 与方式 3 遇到的情形一致.<br/>
 * 2. 结论: 在实际开发中, 不能使用该方式.
 */
@Deprecated
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    /** 对实例化过程加同步锁, 不能解决线程安全问题 */
    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

}
