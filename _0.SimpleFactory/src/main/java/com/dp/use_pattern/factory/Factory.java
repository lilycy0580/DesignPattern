package com.dp.use_pattern.factory;

import com.dp.use_pattern.api.Api;
import com.dp.use_pattern.api.Impl;
import com.dp.use_pattern.api.Impl2;

public class Factory {

//    // 只有一个实现类
//    public static Api createApi(){
//        return new Impl();
//    }

    // 当有多个实现类
    public static Api createApi(int type){
        Api api = null;
        if(type==1){
            api = new Impl();
        }else if(type==2){
            api = new Impl2();
        }
        return api;
    }


}
