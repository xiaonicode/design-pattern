package com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.pizza;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/13 9:49
 * @description: 伦敦奶酪披萨
 */
public class LondonCheesePizza extends BasePizza {

    @Override
    public void prepare() {
        System.out.println("准备伦敦奶酪披萨的原材料;");
    }

}
