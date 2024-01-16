package com.dp.book2.use_pattern.builder.ConcreteBuilder;


import com.dp.book2.use_pattern.builder.CarBuilder;
import com.dp.book2.use_pattern.product.BenzModel;
import com.dp.book2.use_pattern.product.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }


}
