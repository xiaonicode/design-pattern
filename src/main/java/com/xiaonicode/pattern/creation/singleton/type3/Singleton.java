package com.xiaonicode.pattern.creation.singleton.type3;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 16:21
 * @description: 懒汉式 (线程不安全)<br/>
 * 1. 达到了懒加载的效果, 但只能在单线程下使用.<br/>
 * 2. 如果在多线程下, 一个线程进入了判断语句, 还未来得及往下执行,
 * <pre>
 * if (null == instance) {
 *     instance = new Singleton();
 * }</pre>
 * 另一个线程也通过了这个判断语句, 此时便会产生多个实例. 所以在多线程环境下不能使用该方式.<br/>
 * 3. 结论: 实际开发中, 不能使用这种方式.
 */
@Deprecated
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    /** 提供一个静态的公有方法, 当使用到该方法时, 才创建实例对象 */
    public static Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }
        return instance;
    }

}
