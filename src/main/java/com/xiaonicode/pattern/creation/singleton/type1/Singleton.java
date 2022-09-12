package com.xiaonicode.pattern.creation.singleton.type1;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 15:36
 * @description: 饿汉式 (静态变量)<br/>
 * 1. 优点: 写法简单, 在类装载时完成实例化, 避免了线程同步问题.<br/>
 * 2. 缺点: 在类装载时完成实例化, 没有达到懒加载的效果. 如果改实例对象从始至终都未被使用, 则会造成内存浪费.
 * 此外不能确保有其他方式 (或有其他静态方法) 导致类装载.<br/>
 * 3. 结论: 这种方式可用, 但会可能会造成内存浪费.
 */
public class Singleton {

    /** 1. 私有化构造器, 外部不能直接进行实例化 */
    private Singleton() {
    }

    /** 2. 本类内部创建对象实例 */
    private static final Singleton INSTANCE = new Singleton();

    /** 3. 对外提供一个公有的静态方法, 返回实例对象 */
    public static Singleton getInstance() {
        return INSTANCE;
    }

}
