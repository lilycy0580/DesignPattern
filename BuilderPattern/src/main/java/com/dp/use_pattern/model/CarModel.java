package com.dp.use_pattern.model;

import java.util.ArrayList;

public abstract class CarModel {

    private ArrayList<String> sequence = new ArrayList<String>();
    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }

    // 启动
    protected abstract void start();

    // 制动
    protected abstract void stop();

    // 鸣笛
    protected abstract void alarm();

    // 引擎声
    protected abstract void engineBoom();

    // 行车功能
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
