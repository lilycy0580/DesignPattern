package com.dp.use_pattern.builder.concrete_builder;


import com.dp.use_pattern.builder.CarBuilder;
import com.dp.use_pattern.model.concrete_model.BenzModel;
import com.dp.use_pattern.model.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }



    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }




}
