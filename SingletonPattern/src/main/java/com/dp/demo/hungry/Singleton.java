package com.dp.demo.hungry;


// 饿汉式  单例
public class Singleton {

    // 定义一个变量存储创建的实例变量,直接在此处创建实例,只创建一次
    private static Singleton uniqueInstance = new Singleton();

    // 私有化构造方法  在其内部控制创建实例的数目
    private Singleton() {
    }

    // 定义一个方法为客户端提供类实例
    public static Singleton getInstance(){
        // 直接使用已经创建好的实例
        return uniqueInstance;
    }

    // 示意方法,单例可有自己的操作
    public void singletonOperation(){
        // ...
    }

    // 示意属性,单例可以有自己的属性
    private String singletonData;

    // 示意方法,外部通过方法来访问属性值
    public String getSingletonData() {
        return singletonData;
    }
}
