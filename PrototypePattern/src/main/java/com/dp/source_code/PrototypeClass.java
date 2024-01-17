package com.dp.source_code;

public class PrototypeClass implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {

        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            //异常处理
        }
        return prototypeClass;
    }
}
