package com.dp.use_pattern.command;

import com.dp.no_pattern.group.CodeGroup;
import com.dp.no_pattern.group.PageGroup;
import com.dp.no_pattern.group.RequirementGroup;

public abstract class Command {


    protected RequirementGroup requirementGroup = new RequirementGroup();

    protected PageGroup pageGroup = new PageGroup();

    protected CodeGroup codeGroup = new CodeGroup();

    public abstract void execute();


}
