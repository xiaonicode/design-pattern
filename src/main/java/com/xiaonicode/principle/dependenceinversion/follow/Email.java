package com.xiaonicode.principle.dependenceinversion.follow;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 14:00
 * @description:
 */
public class Email implements IReceiver {

    @Override
    public String getInfo() {
        return "电子邮件信息(Pro): hello world";
    }

}
