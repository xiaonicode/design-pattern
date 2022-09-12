package com.xiaonicode.pattern.creation.singleton.type7;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 17:24
 * @description: 静态内部类 <br/>
 * 1. 该方式采用了类装载机制, 保证初始化实例时只有一个线程.<br/>
 * 2. 静态内部类方式在 Singleton 类被装载时并不会立即实例化, 而是在需要实例化时 (调用 getInstance 方法),
 * 才会装载 SingletonHolder 类, 从而完成 Singleton 的实例化.<br/>
 * 3. 类的静态属性只会在第一次加载类时初始化,
 * 所以在这里, JVM 帮助我们保证了线程的安全性, 在类进行初始化时, 别的线程是无法进入的.<br/>
 * 4. 优点: 保证了线程安全, 利用静态内部类特点实现延迟加载, 效率高.<br/>
 * 5. 结论: 在实际生产中, 推荐使用该方式.
 */
public class Singleton {

    private Singleton() {
    }

    private static final class SingletonHolder {

        private static final Singleton INSTANCE = new Singleton();

    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
