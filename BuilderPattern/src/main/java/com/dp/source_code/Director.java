package com.dp.source_code;

public class Director {

    private Builder builder = new ConcreteBuilder();

    // 构建不同的产品
    public Product getAProduct(){
        builder.setPart();
        return builder.buildProduct();
    }


}
