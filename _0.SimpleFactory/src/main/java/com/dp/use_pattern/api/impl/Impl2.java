package com.dp.use_pattern.api.impl;

import com.dp.use_pattern.api.Api;

public class Impl2 implements Api {
    @Override
    public void test1(String s) {
        System.out.println("Now in Impl2,The input is : "+s);
    }
}
