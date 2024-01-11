package com.dp.single_pattern_demo.api;

public class ImplB implements Api{
    @Override
    public void operation(String s) {
        System.out.println("ImplB is "+s);
    }
}
