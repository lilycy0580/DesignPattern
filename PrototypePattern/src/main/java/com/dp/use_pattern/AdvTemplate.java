package com.dp.use_pattern;

public class AdvTemplate {

    // 广告信名称
    private String advSubject = "xxx银行国庆信用卡抽奖活动";


    // 广告信内容
    private String advContext = "国庆抽奖活动通知:只要刷卡就送一百万~~";

    public String getAdvSubject(){
        return this.advSubject;
    }

    public String getAdvContext(){
        return this.advContext;
    }

}
