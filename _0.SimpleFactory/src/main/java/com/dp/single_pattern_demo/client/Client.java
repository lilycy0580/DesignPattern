package com.dp.single_pattern_demo.client;

import com.dp.single_pattern_demo.api.Api;
import com.dp.single_pattern_demo.factory.Factory;

public class Client {

    public static void main(String[] args) {
        Api api = Factory.createApi(1);
        api.operation("SingleFactory Design Pattern");
    }

}
