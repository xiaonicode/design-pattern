package com.xiaonicode.pattern.creation.prototype.deepclone;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/14 11:48
 * @description: 客户端
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepPrototype p1 = new DeepPrototype();
        p1.setName("宋江");
        p1.setDeepCloneableTarget(new DeepCloneableTarget("大牛", "大牛的类"));
        System.out.println("p1.name=" + p1.getName() + ", p1.deepCloneableTarget=" + p1.getDeepCloneableTarget().hashCode());

        // 方式1完成深拷贝
        DeepPrototype p2 = p1.clone();
        System.out.println("p2.name=" + p2.getName() + ", p2.deepCloneableTarget=" + p2.getDeepCloneableTarget().hashCode());

        // 方式2完成深拷贝
        DeepPrototype p3 = p1.deepClone();
        System.out.println("p3.name=" + p3.getName() + ", p3.deepCloneableTarget=" + p3.getDeepCloneableTarget().hashCode());
    }

}
