package com.xiaonicode.pattern.creation.factory.traditionalway.pizzastore.pizza;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/12 20:41
 * @description: 希腊披萨
 */
public class GreekPizza extends BasePizza {

    @Override
    public void prepare() {
        System.out.println("准备希腊披萨的原材料;");
    }

}
