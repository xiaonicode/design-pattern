package com.xiaonicode.pattern.creation.singleton.type6;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 16:43
 * @description: 双重检查 <br/>
 * 1. Double-Check 概念在多线程开发中经常被使用到, 我们进行了两次 if (null == instance) 检查, 即可保证线程安全.<br/>
 * 2. 这样, 实例化代码只用执行一次, 后面再次访问时, 判断 if (null == instance), 直接 return 实例化对象, 也就避免了反复进行方法同步.<br/>
 * 3. 线程安全; 延迟加载; 效率较高.<br/>
 * 4. 结论: 在实际开发中, 推荐使用该方式.
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
    }

    /** 加入双重检查代码, 解决线程安全问题, 同时解决懒加载问题 */
    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
