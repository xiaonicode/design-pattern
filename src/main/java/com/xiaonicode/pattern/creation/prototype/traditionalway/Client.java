package com.xiaonicode.pattern.creation.prototype.traditionalway;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/13 23:39
 * @description: 客户端: 克隆出 9 只羊<br/>
 * 1. 优点是比较好理解, 简单易操作.<br/>
 * 2. 在创建新的对象时, 总是需要重新获取原始对象的属性, 如果创建的对象比较复杂时, 效率较低.<br/>
 * 3. 总是需要重新初始化对象, 而不是动态地获得对象运行时的状态, 不够灵活.
 */
public class Client {

    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("tom", 1, "白色");
        Sheep sheep2 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep3 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep4 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep5 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep6 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep7 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep8 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep9 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());
        Sheep sheep10 = new Sheep(sheep1.getName(), sheep1.getAge(), sheep1.getColor());

        System.out.println("第1只羊: " + sheep1);
        System.out.println("第2只羊: " + sheep2);
        System.out.println("第3只羊: " + sheep3);
        System.out.println("第4只羊: " + sheep4);
        System.out.println("第5只羊: " + sheep5);
        System.out.println("第6只羊: " + sheep6);
        System.out.println("第7只羊: " + sheep7);
        System.out.println("第8只羊: " + sheep8);
        System.out.println("第9只羊: " + sheep9);
        System.out.println("第10只羊: " + sheep10);
    }

}
