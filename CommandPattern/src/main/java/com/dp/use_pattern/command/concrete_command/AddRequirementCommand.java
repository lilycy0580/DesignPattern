package com.dp.use_pattern.command.concrete_command;

import com.dp.use_pattern.command.Command;

// 产品组：增加一个需求
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.pageGroup.add();
        super.codeGroup.add();
        super.requirementGroup.plan();
    }
}
