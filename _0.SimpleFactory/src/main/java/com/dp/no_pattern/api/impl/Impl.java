package com.dp.no_pattern.api.impl;

import com.dp.no_pattern.api.Api;

public class Impl implements Api {
    @Override
    public void test1(String s) {
        System.out.println("Now in Impl,The import is : "+s);
    }
}
