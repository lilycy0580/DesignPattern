package com.dp.use_pattern.api.impl;

import com.dp.use_pattern.api.Api;

public class Impl implements Api {
    @Override
    public void test1(String s) {
        System.out.println("Now in Impl,The input is : "+s);
    }
}
