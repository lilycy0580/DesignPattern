package com.dp.use_pattern.command;


import com.dp.use_pattern.group.concrete_group.CodeGroup;
import com.dp.use_pattern.group.concrete_group.PageGroup;
import com.dp.use_pattern.group.concrete_group.RequirementGroup;

public abstract class Command {

    protected RequirementGroup requirementGroup = new RequirementGroup();

    protected PageGroup pageGroup = new PageGroup();

    protected CodeGroup codeGroup = new CodeGroup();

    // 执行
    public abstract void execute();


}
