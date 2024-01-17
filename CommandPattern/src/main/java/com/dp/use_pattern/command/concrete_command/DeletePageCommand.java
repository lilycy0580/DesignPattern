package com.dp.use_pattern.command.concrete_command;

import com.dp.use_pattern.command.Command;

// 美工组：删除一个页面
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pageGroup.find();
        super.pageGroup.delete();
        super.pageGroup.plan();
    }
}
