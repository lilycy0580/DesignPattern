package com.dp.transition_pattern;

import com.dp.no_pattern.BMWModel;
import com.dp.no_pattern.BenzModel;

import java.util.ArrayList;

public class Client {


    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engineBoom");
        sequence.add("start");
        sequence.add("stop");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
        benzModel.run();

        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmwModel = (BMWModel) bmwBuilder.getCarModel();
        bmwModel.run();

    }

}
