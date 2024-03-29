package com.dp.use_pattern.invoke;

import com.dp.use_pattern.command.Command;

public class Invoker {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    // 执行客户的命令
    public void action(){
        this.command.execute();
    }

}
