package com.dp.use_pattern.invoke;

import com.dp.use_pattern.command.Command;

public class Invoker {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }

}
