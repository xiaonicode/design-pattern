package com.xiaonicode.principle.dependenceinversion.follow;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 14:41
 * @description:
 */
public class Wechat implements IReceiver {

    @Override
    public String getInfo() {
        return "微信信息(Pro): hello ok";
    }

}
