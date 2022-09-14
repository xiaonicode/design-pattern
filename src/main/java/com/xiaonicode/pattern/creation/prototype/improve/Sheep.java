package com.xiaonicode.pattern.creation.prototype.improve;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/14 10:22
 * @description: 羊 <br/>
 * 1. 原型模式是指: 用原型实例指定创建对象的种类, 并且通过拷贝这些原型, 创建新的对象.<br/>
 * 2. 原型模式是一种创建型设计模式, 允许一个对象再创建另外一个可定制的对象, 无需知道如何创建的细节.<br/>
 * 3. 工作原理是: 通过将一个原型对象传给那个要发动创建的对象, 这个要发动创建的对象通过请求原型对象拷贝它们自己来实施创建, 即对象.clone().
 */
public class Sheep implements Cloneable {

    private String name;

    private int age;

    private String color;

    private Sheep friend;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                '}';
    }

    /** 使用默认的克隆方式, 克隆该实例 */
    @Override
    protected Sheep clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }

}
