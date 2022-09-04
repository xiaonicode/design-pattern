package com.xiaonicode.principle.dependenceinversion.follow;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 14:31
 * @description: 方案 2: 抽象出一个接口, 用于接收信息. 这样 Person 类与接口 IReceiver 发生依赖.<br/>
 * 因为 Wechat, Email 等等属于接收范围, 它们各自实现 IReceiver 接口即可, 客户端无需修改.
 */
public interface IReceiver {

    String getInfo();

}
