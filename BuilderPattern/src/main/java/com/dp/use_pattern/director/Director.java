package com.dp.use_pattern.director;



import com.dp.use_pattern.builder.concrete_builder.BMWBuilder;
import com.dp.use_pattern.builder.concrete_builder.BenzBuilder;
import com.dp.use_pattern.model.concrete_model.BMWModel;
import com.dp.use_pattern.model.concrete_model.BenzModel;

import java.util.ArrayList;

public class Director {

    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    // A类型的BenzModel
    public BenzModel getABenzModel(){
        // todo List与Map若是定义成类的成员变量,则一定clear().防止数据混乱
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        // todo 使用this调用本类中的成员与属性   super同理
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    // B类型的BenzModel
    public BenzModel getBBenzModel(){
        this.sequence.clear();
        this.sequence.add("engineBoom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    // C类型的BMWModel
    public BMWModel getCBMWModel(){
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    // D类型的BMWModel
    public BMWModel getDBMWModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

}
