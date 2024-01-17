package com.dp.source_code.command.concrete_command;

import com.dp.source_code.command.Command;
import com.dp.source_code.receiver.Receiver;
import com.dp.source_code.receiver.concrete_receiver.ConcreteReceiver2;


public class ConcreteCommand2 extends Command {

    public ConcreteCommand2() {
        super(new ConcreteReceiver2());
    }

    public ConcreteCommand2(Receiver receiver) {
        super(receiver);
    }


    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
