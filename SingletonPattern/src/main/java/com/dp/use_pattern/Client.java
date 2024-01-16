package com.dp.use_pattern;

public class Client {

    public static void main(String[] args) {
        // 创建读取配置文件的对象
        AppConfig config = AppConfig.getInstance();
        String paramA = config.getParamA();
        String paramB = config.getParamB();
        System.out.println("paramA = "+paramA+",   paramB="+paramB);


    }
}
