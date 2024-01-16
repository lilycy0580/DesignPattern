package com.dp.book2.transition_pattern;

import com.dp.book2.no_pattern.CarModel;

import java.util.ArrayList;

public abstract class CarBuilder {

    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();


}
