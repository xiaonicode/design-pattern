package com.xiaonicode.pattern.creation.prototype.improve;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/14 10:31
 * @description: 客户端: 克隆出 9 只羊
 */
public class Client {

    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("tom", 1, "白色");
        sheep1.setFriend(new Sheep("jack", 2, "黑色"));

        Sheep sheep2 = sheep1.clone();
        Sheep sheep3 = sheep1.clone();
        Sheep sheep4 = sheep1.clone();
        Sheep sheep5 = sheep1.clone();
        Sheep sheep6 = sheep1.clone();
        Sheep sheep7 = sheep1.clone();
        Sheep sheep8 = sheep1.clone();
        Sheep sheep9 = sheep1.clone();
        Sheep sheep10 = sheep1.clone();

        System.out.println("第1只羊: " + sheep1 + ", friend: " + sheep1.getFriend().hashCode());
        System.out.println("第2只羊: " + sheep2 + ", friend: " + sheep2.getFriend().hashCode());
        System.out.println("第3只羊: " + sheep3 + ", friend: " + sheep3.getFriend().hashCode());
        System.out.println("第4只羊: " + sheep4 + ", friend: " + sheep4.getFriend().hashCode());
        System.out.println("第5只羊: " + sheep5 + ", friend: " + sheep5.getFriend().hashCode());
        System.out.println("第6只羊: " + sheep6 + ", friend: " + sheep6.getFriend().hashCode());
        System.out.println("第7只羊: " + sheep7 + ", friend: " + sheep7.getFriend().hashCode());
        System.out.println("第8只羊: " + sheep8 + ", friend: " + sheep8.getFriend().hashCode());
        System.out.println("第9只羊: " + sheep9 + ", friend: " + sheep9.getFriend().hashCode());
        System.out.println("第10只羊: " + sheep10 + ", friend: " + sheep10.getFriend().hashCode());
    }

}
