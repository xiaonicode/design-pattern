package com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.order;

import com.xiaonicode.pattern.creation.factory.abstractfactory.pizzastore.pizza.BasePizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/13 14:30
 * @description: 订购披萨
 */
public class OrderPizza1 {

    private BaseFactory factory;

    public OrderPizza1(BaseFactory factory) {
        setFactory(factory);
    }

    private void setFactory(BaseFactory factory) {
        this.factory = factory;

        do {
            BasePizza pizza = factory.createPizza(getOrderType());
            if (null != pizza) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
        } while (true);
    }

    private String getOrderType() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入披萨类型: ");
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
