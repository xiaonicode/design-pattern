package com.xiaonicode.pattern.creation.factory.simplefactory.pizzastore.order;

import com.xiaonicode.pattern.creation.factory.simplefactory.pizzastore.pizza.BasePizza;
import com.xiaonicode.pattern.creation.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.xiaonicode.pattern.creation.factory.simplefactory.pizzastore.pizza.GreekPizza;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 21:35
 * @description: 简单工厂类 <br/>
 * 1. 简单工厂模式属于创建者模式, 是工厂模式的一种.
 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例.
 * 简单工厂模式是工厂模式家族中最简单实用的模式.<br/>
 * 2. 简单工厂模式: 定义了一个创建对象的类, 由这个类封装实例化对象的行为.<br/>
 * 3. 简单工厂模式又叫静态工厂模式.<br/>
 * 3. 在软件开发中, 我们会用到大量的创建某种, 某类或者某批对象时, 就会使用到工厂模式.
 */
public class SimpleFactory {

    /**
     * 普通成员方法: 根据订购类型, 创建一个披萨
     *
     * @param orderType 订购类型
     * @return 披萨实例对象
     */
    public BasePizza createPizza1(String orderType) {
        System.out.println("进入普通成员方法 ...");
        BasePizza pizza = null;

        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }// 若再次扩展披萨基类, 则此处要添加相应的分支.

        return pizza;
    }

    /**
     * 静态方法: 根据订购类型, 创建一个披萨
     *
     * @param orderType 订购类型
     * @return 披萨实例对象
     */
    public static BasePizza createPizza2(String orderType) {
        System.out.println("进入静态方法 ...");
        BasePizza pizza = null;

        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }

}
