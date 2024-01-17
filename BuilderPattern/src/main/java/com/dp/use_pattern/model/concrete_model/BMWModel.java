package com.dp.use_pattern.model.concrete_model;

import com.dp.use_pattern.model.CarModel;

public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("BMW start");
    }

    @Override
    protected void stop() {
        System.out.println("BMW stop");
    }

    @Override
    protected void alarm() {
        System.out.println("BMW alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("BMW engineBoom");
    }
}
