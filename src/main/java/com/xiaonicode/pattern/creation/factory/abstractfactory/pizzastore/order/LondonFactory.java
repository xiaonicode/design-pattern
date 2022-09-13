package com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.order;

import com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.pizza.BasePizza;
import com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.pizza.LondonCheesePizza;
import com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.pizza.LondonPepperPizza;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/13 14:24
 * @description: 伦敦工厂
 */
public class LondonFactory implements BaseFactory {

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
