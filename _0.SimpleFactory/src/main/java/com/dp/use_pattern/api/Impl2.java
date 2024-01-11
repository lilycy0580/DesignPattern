package com.dp.use_pattern.api;

public class Impl2 implements Api {
    @Override
    public void test1(String s) {
        System.out.println("Now in Impl2,The input is : "+s);
    }
}
