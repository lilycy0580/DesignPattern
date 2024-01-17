package com.dp.source_code;

import com.dp.source_code.command.Command;
import com.dp.source_code.command.concrete_command.ConcreteCommand1;


public class Client {

    public static void main(String[] args) {
        // 首先声明调用者
        Invoker invoker = new Invoker();
        // 定义一个发送给接收者的指令
        Command command = new ConcreteCommand1();
        // 将命令交给调用者执行
        invoker.setCommand(command);
        invoker.action();


    }

}
