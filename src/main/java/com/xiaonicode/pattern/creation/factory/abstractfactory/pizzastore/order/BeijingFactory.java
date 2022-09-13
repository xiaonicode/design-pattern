package com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.order;

import com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.pizza.BasePizza;
import com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.pizza.BeijingCheesePizza;
import com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.pizza.BeijingPepperPizza;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/13 14:24
 * @description: 北京工厂
 */
public class BeijingFactory implements BaseFactory {

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
