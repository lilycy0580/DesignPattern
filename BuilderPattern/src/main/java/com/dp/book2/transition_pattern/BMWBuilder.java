package com.dp.book2.transition_pattern;

import com.dp.book2.no_pattern.BMWModel;
import com.dp.book2.no_pattern.CarModel;

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
