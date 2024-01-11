package com.dp.client;

import com.dp.api.Api;
import com.dp.api.Impl;

public class Client {
    public static void main(String[] args) {
        // 客户端调用需知道接口和具体的实现类 与 封装隔离的思想相背
        Api api = new Impl();
        api.test1("Jsut test it!");
    }
}
