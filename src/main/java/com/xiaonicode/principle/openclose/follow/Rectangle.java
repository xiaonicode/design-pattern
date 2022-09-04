package com.xiaonicode.principle.openclose.follow;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 18:01
 * @description:
 */
public class Rectangle extends Shape {

    public Rectangle() {
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("---绘制矩形---");
    }

}
