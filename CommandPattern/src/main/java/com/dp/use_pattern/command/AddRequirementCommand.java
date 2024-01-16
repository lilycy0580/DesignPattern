package com.dp.use_pattern.command;

public class AddRequirementCommand extends Command{
    @Override
    public void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.requirementGroup.plan();
    }
}
