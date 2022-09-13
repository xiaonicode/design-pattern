package com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.pizza;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/13 9:45
 * @description: 披萨基类
 */
public abstract class BasePizza {

    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    /** 准备原材料, 不同披萨的原材料不一样, 因此该方法需要抽象, 由子类负责实现具体内容. */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " backing;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    public void box() {
        System.out.println(name + " boxing;");
    }

}
