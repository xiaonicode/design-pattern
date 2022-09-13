package com.xiaonicode.pattern.creation.factory.factorymethod.pizzastore.pizza;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/13 9:48
 * @description: 北京胡椒披萨
 */
public class BeijingPepperPizza extends BasePizza {

    @Override
    public void prepare() {
        System.out.println("准备北京胡椒披萨的原材料;");
    }

}
