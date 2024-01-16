package com.dp.cache;

import java.util.HashMap;
import java.util.Map;

public class JavaCache {

    private Map<String,Object> map = new HashMap<String,Object>();

    public Object getValue(String key){
        Object obj = map.get(key);
        if(obj==null){
            obj = key+",value";
            map.put(key,obj);
        }
        return obj;
    }



}
