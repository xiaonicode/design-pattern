package com.xiaonicode.principle.dependenceinversion.follow;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 13:59
 * @description: 当接收方式被扩展后, 使用方无需任何修改.
 */
public class Person {

    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }

}
