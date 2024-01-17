package com.dp.source_code.command.concrete_command;

import com.dp.source_code.command.Command;
import com.dp.source_code.receiver.Receiver;
import com.dp.source_code.receiver.concrete_receiver.ConcreteReceiver1;


public class ConcreteCommand1 extends Command {

    public ConcreteCommand1() {
        super(new ConcreteReceiver1());
    }

    public ConcreteCommand1(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
