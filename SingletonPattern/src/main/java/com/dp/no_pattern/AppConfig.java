package com.dp.no_pattern;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// 注意没有setter方法
public class AppConfig {

    private String paramA;

    private String paramB;

    public AppConfig() {
        readConfig();
    }

    private void readConfig(){
        Properties prop = new Properties();
        InputStream in = null;
        try {
            in = AppConfig.class.getResourceAsStream("/AppConfig.properties");
            prop.load(in);
            // 将配置文件的内容读出来设置在属性上
            this.paramA = prop.getProperty("paramA");
            this.paramB = prop.getProperty("paramB");
        } catch (IOException e) {
            System.out.println("装载配置文件出错,具体堆栈信息如下:");
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public String getParamA() {
        return paramA;
    }

    public String getParamB() {
        return paramB;
    }

}
