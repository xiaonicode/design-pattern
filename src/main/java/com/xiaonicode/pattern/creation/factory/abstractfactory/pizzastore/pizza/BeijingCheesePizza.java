package com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.pizza;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/13 9:48
 * @description: 北京奶酪披萨
 */
public class BeijingCheesePizza extends BasePizza {

    @Override
    public void prepare() {
        System.out.println("准备北京奶酪披萨的原材料;");
    }

}
