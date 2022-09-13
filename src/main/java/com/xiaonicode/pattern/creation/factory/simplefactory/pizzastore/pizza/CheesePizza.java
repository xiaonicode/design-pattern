package com.xiaonicode.pattern.creation.factory.simplefactory.pizzastore.pizza;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 20:41
 * @description: 奶酪披萨
 */
public class CheesePizza extends BasePizza {

    @Override
    public void prepare() {
        System.out.println("准备奶酪披萨的原材料;");
    }

}
