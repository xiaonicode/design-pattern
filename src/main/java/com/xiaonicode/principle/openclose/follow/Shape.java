package com.xiaonicode.principle.openclose.follow;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 17:59
 * @description: 抽象基类, 声明一个抽象方法, 各个子类实现该方法即可
 */
public abstract class Shape {

    public int type;

    public abstract void draw();

}
