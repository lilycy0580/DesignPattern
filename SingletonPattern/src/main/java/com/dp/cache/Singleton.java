package com.dp.cache;

import java.util.HashMap;
import java.util.Map;

public class Singleton {

    private final static String DEFAULT_KEY = "One";

    private static Map<String,Singleton> map = new HashMap<String,Singleton>();

    private Singleton(){

    }

    public static Singleton getInstance(){
        Singleton instance = (Singleton) map.get(DEFAULT_KEY);
        if(instance==null){
            instance = new Singleton();
            map.put(DEFAULT_KEY,instance);
        }
    }

}
