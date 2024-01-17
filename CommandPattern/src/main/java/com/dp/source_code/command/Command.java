package com.dp.source_code.command;

import com.dp.source_code.receiver.Receiver;

public abstract class Command {
    protected final Receiver receiver;
    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    // 每个命令类都必须有一个执行命令的方法
    public abstract void execute();
}
