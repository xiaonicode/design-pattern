package com.xiaonicode.principle.dependenceinversion.violate;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 13:59
 * @description:
 */
public class Person {

    /**
     * 方案 1 简单, 表较容易想到<br/>
     * 如果我们获取的对象是微信, 短信等等, 则需要新增类, 同时 Person 也要增加相应的接受方法
     */
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }

}
