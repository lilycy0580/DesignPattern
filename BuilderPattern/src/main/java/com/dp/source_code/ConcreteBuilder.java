package com.dp.source_code;

public class ConcreteBuilder extends Builder{

    private Product product = new Product();


    @Override
    public void setPart() {
        // 零部件内部逻辑处理

    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
