package com.dp.book2.use_pattern.builder;



import com.dp.book2.use_pattern.product.CarModel;

import java.util.ArrayList;

public abstract class CarBuilder {

    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();

}
