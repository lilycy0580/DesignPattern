package com.dp.no_pattern;

import java.util.ArrayList;

public abstract class CarModel {

    // 顺序  汽车的行车,泊车,鸣笛,引擎声都是由车商自己控制,他想什么顺序就什么顺序
    private ArrayList<String> sequence = new ArrayList<String>();
    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }

    // 行车
    protected abstract void start();

    // 泊车
    protected abstract void stop();

    // 鸣笛
    protected abstract void alarm();

    // 引擎声
    protected abstract void engineBoom();

    final public void run(){
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            }else if(actionName.equalsIgnoreCase("alarm")){
                this.alarm();
            }else if(actionName.equalsIgnoreCase("engineBoom")){
                this.engineBoom();
            }
        }
    }



}
