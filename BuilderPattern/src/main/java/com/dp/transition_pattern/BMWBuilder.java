package com.dp.transition_pattern;

import com.dp.no_pattern.BMWModel;
import com.dp.no_pattern.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder{

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
