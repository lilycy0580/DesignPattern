package com.dp.use_pattern.factory;

import com.dp.use_pattern.api.Api;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Factory {

//    // 只有一个实现类
//    public static Api createApi(){
//        return new Impl();
//    }

//    // 当有两个个实现类
//    public static Api createApi(int type){
//        Api api = null;
//        if(type==1){
//            api = new Impl();
//        }else if(type==2){
//            api = new Impl2();
//        }
//        return api;
//    }

    // 当有多个实现类
    public static Api createApi(){
        Properties prop = new Properties();
        InputStream in = null;
        try {
            in = Factory.class.getResourceAsStream("/FactoryTest.properties");
            prop.load(in);
        } catch (IOException e) {
            System.out.print("装载工厂配置文件出错了,具体的堆栈信息如下:");
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Api api = null;
        try {
            api = (Api)Class.forName(prop.getProperty("ImplClass")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }
}
