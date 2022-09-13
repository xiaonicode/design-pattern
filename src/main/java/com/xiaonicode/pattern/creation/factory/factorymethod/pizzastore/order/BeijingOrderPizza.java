package com.xiaonicode.pattern.creation.factory.factorymethod.pizzastore.order;

import com.xiaonicode.pattern.creation.factory.factorymethod.pizzastore.pizza.BasePizza;
import com.xiaonicode.pattern.creation.factory.factorymethod.pizzastore.pizza.BeijingCheesePizza;
import com.xiaonicode.pattern.creation.factory.factorymethod.pizzastore.pizza.BeijingPepperPizza;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/13 11:09
 * @description: 订购北京的披萨
 */
public class BeijingOrderPizza extends BaseOrderPizza {

    @Override
    public BasePizza createPizza(String orderType) {
        BasePizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BeijingCheesePizza();
            pizza.setName("北京奶酪披萨");
        } else if ("pepper".equals(orderType)) {
            pizza = new BeijingPepperPizza();
            pizza.setName("北京胡椒披萨");
        }
        return pizza;
    }

}
