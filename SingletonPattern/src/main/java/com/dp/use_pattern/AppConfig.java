package com.dp.use_pattern;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

    // 定义一个变量存储创建好的类实例,在此处创建实例,且只创建一次
    private static AppConfig instance = new AppConfig();

    // 定义一个方法为客户端提供AppConfig类的实例
    public static AppConfig getInstance(){
        return instance;
    }

    // 配置文件的参数a
    private String paramA;
    private String paramB;

    public String getParamA() {
        return paramA;
    }

    public String getParamB() {
        return paramB;
    }

    // 私有化构造方法
    private AppConfig(){
        // 读取配置文件
        readConfig();
    }

    private void readConfig(){
        Properties prop = new Properties();
        InputStream in = null;
        try {
            in = AppConfig.class.getResourceAsStream("/AppConfig.properties");
            prop.load(in);
            this.paramA = prop.getProperty("paramA");
            this.paramB = prop.getProperty("paramB");
        } catch (IOException e) {
            System.out.println("加载配置文件出错,具体堆栈信息如下:");
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }









































}
