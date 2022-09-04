package com.xiaonicode.principle.openclose.follow;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 18:00
 * @description:
 */
public class Circle extends Shape {

    public Circle() {
        super.type = 2;
    }

    @Override
    public void draw() {
        System.out.println("---绘制圆形---");
    }

}
