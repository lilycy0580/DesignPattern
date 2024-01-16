package com.dp.no_pattern.group;

public class RequirementGroup extends Group{
    @Override
    public void find() {
        System.out.println("find 需求组");
    }

    @Override
    public void add() {
        System.out.println("客户增加需求");
    }

    @Override
    public void delete() {
        System.out.println("客户删除需求");
    }

    @Override
    public void change() {
        System.out.println("客户更改需求");
    }

    @Override
    public void plan() {
        System.out.println("客户给出需求计划");
    }
}
