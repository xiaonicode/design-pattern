package com.xiaonicode.pattern.creation.builder.improve;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/14 14:23
 * @description: 建造者 <br/>
 * 1. 建造者模式又叫生成器模式, 是一种对象构建模式. 它可以将复杂对象的建造过程抽象出来,
 * 使这个抽象过程的不同实现方法构造出不同实现 (属性) 的对象.
 * 2. 建造者模式是一步一步创建一个复杂对象, 允许用户只通过指定复杂对象的类型和内容就可以创建它们,
 * 用户不需要知道内部的具体构建细节.
 */
public abstract class HouseBuilder {

    private final House house = new House();

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public House buildHouse() {
        return house;
    }

}
