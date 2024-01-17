package com.dp.use_pattern.builder.concrete_builder;


import com.dp.use_pattern.builder.CarBuilder;
import com.dp.use_pattern.model.concrete_model.BMWModel;
import com.dp.use_pattern.model.CarModel;

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
