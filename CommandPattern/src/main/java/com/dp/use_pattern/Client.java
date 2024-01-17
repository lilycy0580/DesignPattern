package com.dp.use_pattern;

import com.dp.use_pattern.command.concrete_command.AddRequirementCommand;
import com.dp.use_pattern.command.Command;
import com.dp.use_pattern.command.concrete_command.DeletePageCommand;
import com.dp.use_pattern.invoke.Invoker;

public class Client {


    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        System.out.println("----------------产品组：增加一条需求------------");
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();

        System.out.println("----------------美工组：删除一个页面--------------------");
        command = new DeletePageCommand();
        invoker.setCommand(command);
        invoker.action();



    }

}
