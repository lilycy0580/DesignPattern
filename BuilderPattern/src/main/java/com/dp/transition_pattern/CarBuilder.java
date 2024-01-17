package com.dp.transition_pattern;

import com.dp.no_pattern.CarModel;

import java.util.ArrayList;

public abstract class CarBuilder {

    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();


}
