package com.xiaonicode.pattern.creation.singleton.type8;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 19:38
 * @description: 枚举 <br/>
 * 1. 借助 JDK 1.5 中添加的枚举来实现单例模式, 不仅可以避免多线程同步问题, 而且还能防止反序列化重新创建新的对象.<br/>
 * 2. 这种方式是 Effective Java 作者 Josh Bloch 提倡的方式.<br/>
 * 3. 结论: 在实际生产中, 推荐使用该方式.
 */
public enum Singleton {
    INSTANCE;

    public void sayOk() {
        System.out.println("ok~");
    }

}
