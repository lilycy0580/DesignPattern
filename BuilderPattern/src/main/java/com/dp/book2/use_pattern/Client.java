package com.dp.book2.use_pattern;

import com.dp.book2.use_pattern.director.Director;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        System.out.println("量产A型Benz...........................");
        for (int i = 0; i < 2; i++) {
            director.getABenzModel().run();
        }
        System.out.println("量产B型Benz....................");
        for (int i = 0; i < 2; i++) {
            director.getBBenzModel().run();
        }
        System.out.println("量产C型BMW..........");
        for (int i = 0; i < 2; i++) {
            director.getCBMWModel().run();
        }
        System.out.println("量产D型BMW.......................");
        for (int i = 0; i < 2; i++) {
            director.getDBMWModel().run();
        }
    }

}
