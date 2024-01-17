package com.dp.no_pattern;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        BenzModel benzModel = new BenzModel();
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engineBoom");
        sequence.add("start");
        sequence.add("stop");
        benzModel.setSequence(sequence);
        benzModel.run();

        // 对于每个需要都要写一遍场景类就很麻烦


    }
}
