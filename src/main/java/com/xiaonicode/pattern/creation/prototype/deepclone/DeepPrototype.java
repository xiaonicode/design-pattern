package com.xiaonicode.pattern.creation.prototype.deepclone;

import java.io.*;

/**
 * @author: xiaonicode
 * @createTime: 2022/9/14 11:39
 * @description:
 */
public class DeepPrototype implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private String name;

    private DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    @Override
    public String toString() {
        return "DeepPrototype{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }

    /** 深拷贝方式1: 重写 clone 方法 */
    @Override
    protected DeepPrototype clone() throws CloneNotSupportedException {
        // 完成对基本数据类型 (属性) 和 String 的克隆
        DeepPrototype deepPrototype = (DeepPrototype) super.clone();

        // 对引用类型的属性进行单独处理
        deepPrototype.deepCloneableTarget = deepCloneableTarget.clone();
        return deepPrototype;
    }

    /** 深拷贝方式2: 通过对象序列化 (推荐) */
    public DeepPrototype deepClone() {
        // 序列化
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            // 将当前对象以对象流的形式输出
            oos.writeObject(this);
            // 反序列化
            try (ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                 ObjectInputStream ois = new ObjectInputStream(bis)) {
                return (DeepPrototype) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
