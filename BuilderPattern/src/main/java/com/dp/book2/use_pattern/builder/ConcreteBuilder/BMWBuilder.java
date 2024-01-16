package com.dp.book2.use_pattern.builder.ConcreteBuilder;


import com.dp.book2.use_pattern.builder.CarBuilder;
import com.dp.book2.use_pattern.product.BMWModel;
import com.dp.book2.use_pattern.product.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {

    private BMWModel bmwModel = new BMWModel();
    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }
}
