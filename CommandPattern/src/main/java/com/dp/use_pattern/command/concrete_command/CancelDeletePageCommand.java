package com.dp.use_pattern.command.concrete_command;

import com.dp.use_pattern.command.Command;

public class CancelDeletePageCommand extends Command {

    // 撤销删除一个页面的命令
    @Override
    public void execute() {
        super.requirementGroup.rollback();
    }
}
