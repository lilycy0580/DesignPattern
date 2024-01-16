package com.dp.book2.transition_pattern;

import com.dp.book2.no_pattern.BenzModel;
import com.dp.book2.no_pattern.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder{

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
