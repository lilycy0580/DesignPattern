package com.dp.use_pattern.builder;



import com.dp.use_pattern.model.CarModel;

import java.util.ArrayList;

public abstract class CarBuilder {

    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();

}
