package com.xiaonicode.pattern.creation.singleton.type4;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 16:43
 * @description: 懒汉式 (线程安全, 同步方法)<br/>
 * 1. 解决了线程不安全问题.<br/>
 * 2. 效率太低, 每个线程在想获得类的实例时候, 执行 getInstance 方法都要进行同步.
 * 实际上该方法只需执行一次就足够了, 后面在想获取该实例对象, 直接 return 即可.<br/>
 * 3. 结论: 在实际开发中, 不推荐使用该方式.
 */
@Deprecated
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    /** 加入同步锁, 解决线程安全问题 */
    public static synchronized Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }
        return instance;
    }

}
