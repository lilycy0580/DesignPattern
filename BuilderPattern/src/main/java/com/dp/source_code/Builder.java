package com.dp.source_code;

public abstract class Builder {

    // 设置产品的不同部分以获取不同的产品   各种零部件
    public abstract void setPart();


    // 建造产品
    public abstract Product buildProduct();
}
