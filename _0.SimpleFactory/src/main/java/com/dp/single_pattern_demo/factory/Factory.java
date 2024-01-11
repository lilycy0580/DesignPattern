package com.dp.single_pattern_demo.factory;

import com.dp.single_pattern_demo.api.Api;
import com.dp.single_pattern_demo.api.ImplA;
import com.dp.single_pattern_demo.api.ImplB;

public class Factory {

    public static Api createApi(int condition){
        Api api = null;
        if(condition==1){
            api = new ImplA();
        }else if(condition==2){
            api = new ImplB();
        }
        return api;
    }

}
