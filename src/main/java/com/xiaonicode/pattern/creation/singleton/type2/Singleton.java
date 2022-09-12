package com.xiaonicode.pattern.creation.singleton.type2;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 15:36
 * @description: 饿汉式 (静态代码块)<br/>
 * 1. 该方式与饿汉式 (静态变量) 类似, 只是将类实例化过程放在了静态代码块中,
 * 也就是在类装载时, 就执行静态代码块中的代码, 初始化类的实例.<br/>
 * 2. 结论: 这种方式可用, 但会可能会造成内存浪费.
 */
public class Singleton {

    /** 1. 私有化构造器, 外部不能直接进行实例化 */
    private Singleton() {
    }

    /** 2. 本类内部创建对象实例 */
    private static final Singleton INSTANCE;

    static {
        // 在静态代码块中, 创建单例对象
        INSTANCE = new Singleton();
    }

    /** 3. 对外提供一个公有的静态方法, 返回实例对象 */
    public static Singleton getInstance() {
        return INSTANCE;
    }

}
