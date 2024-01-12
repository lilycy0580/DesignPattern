package com.dp.no_pattern;

public class Client {

    public static void main(String[] args) {
        AppConfig config = new AppConfig();
        String paramA = config.getParamA();
        String paramB = config.getParamB();
        System.out.println("paramA="+paramA+",  paramB="+paramB);
    }


}
