package com.xiaonicode.pattern.creation.factory.factorymethod.pizzastore.pizza;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/13 9:49
 * @description: 伦敦胡椒披萨
 */
public class LondonPepperPizza extends BasePizza {

    @Override
    public void prepare() {
        System.out.println("准备伦敦胡椒披萨的原材料;");
    }

}
