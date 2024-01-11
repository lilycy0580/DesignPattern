package com.dp.no_pattern.api;

public class Impl implements Api{
    @Override
    public void test1(String s) {
        System.out.println("Now in Impl,The import is : "+s);
    }
}
