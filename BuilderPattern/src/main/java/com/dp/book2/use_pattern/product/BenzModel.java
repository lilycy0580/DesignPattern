package com.dp.book2.use_pattern.product;

public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("Benz start");
    }

    @Override
    protected void stop() {
        System.out.println("Benz stop");
    }

    @Override
    protected void alarm() {
        System.out.println("Benz alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Benz engineBoom");
    }
}
