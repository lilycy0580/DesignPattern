package com.dp.demo.lazy;


// 懒汉式  单例
public class Singleton {

    // 缓存的思想
    private static Singleton uniqueInstance = null;

    // 私有化构造方法  在其内部控制创建实例的数目
    private Singleton() {
    }

    // 定义一个方法为客户端提供类实例
    public static synchronized Singleton getInstance(){
        // 延迟加载的思想  缓存的实现
        if(uniqueInstance==null){
            uniqueInstance = new Singleton();
        }
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
