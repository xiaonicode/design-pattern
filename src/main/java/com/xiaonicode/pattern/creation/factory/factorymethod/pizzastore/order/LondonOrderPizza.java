package com.xiaonicode.pattern.creation.factory.factorymethod.pizzastore.order;

import com.xiaonicode.pattern.creation.factory.factorymethod.pizzastore.pizza.BasePizza;
import com.xiaonicode.pattern.creation.factory.factorymethod.pizzastore.pizza.LondonCheesePizza;
import com.xiaonicode.pattern.creation.factory.factorymethod.pizzastore.pizza.LondonPepperPizza;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/13 11:13
 * @description: 订购伦敦的披萨
 */
public class LondonOrderPizza extends BaseOrderPizza {

    @Override
    public BasePizza createPizza(String orderType) {
        BasePizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LondonCheesePizza();
            pizza.setName("伦敦奶酪披萨");
        } else if ("pepper".equals(orderType)) {
            pizza = new LondonPepperPizza();
            pizza.setName("伦敦胡椒披萨");
        }
        return pizza;
    }

}
