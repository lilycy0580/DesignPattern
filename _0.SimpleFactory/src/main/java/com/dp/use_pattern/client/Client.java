package com.dp.use_pattern.client;

import com.dp.use_pattern.api.Api;
import com.dp.use_pattern.factory.Factory;

public class Client {

    public static void main(String[] args) {
        Api api = Factory.createApi();
        api.test1("just test!");
    }

}
