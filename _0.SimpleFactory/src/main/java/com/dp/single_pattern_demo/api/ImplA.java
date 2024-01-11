package com.dp.single_pattern_demo.api;

public class ImplA implements Api{
    @Override
    public void operation(String s) {
        System.out.println("ImplA is "+s);
    }
}
