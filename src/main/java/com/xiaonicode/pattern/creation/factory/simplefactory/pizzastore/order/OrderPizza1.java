package com.xiaonicode.pattern.creation.factory.simplefactory.pizzastore.order;

import com.xiaonicode.pattern.creation.factory.simplefactory.pizzastore.pizza.BasePizza;
import com.xiaonicode.pattern.creation.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.xiaonicode.pattern.creation.factory.simplefactory.pizzastore.pizza.GreekPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 20:42
 * @description: 订购披萨 (传统方式) <br/>
 * 1. 优点: 比较容易理解, 易操作.<br/>
 * 2. 缺点: 是违反了设计模式的 OCP 原则, 即对扩展开发, 对修改关闭.
 */
@Deprecated
public class OrderPizza1 {

    public OrderPizza1() {
        BasePizza pizza;
        String orderType;

        do {
            orderType = getOrderType();
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if ("cheese".equals(orderType)) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else { // 若再次扩展披萨基类, 则此处要添加相应的分支.
                break;
            }

            // 输出披萨的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    /** 获取用户需要订购的披萨类型 */
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
