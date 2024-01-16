package com.dp.no_pattern.group;

public class CodeGroup extends Group{
    @Override
    public void find() {
        System.out.println("找到研发部门");
    }

    @Override
    public void add() {
        System.out.println("研发部门增加功能");
    }

    @Override
    public void delete() {
        System.out.println("研发部门删除功能");
    }

    @Override
    public void change() {
        System.out.println("研发部门改变功能");
    }

    @Override
    public void plan() {
        System.out.println("客户给出功能变更计划");
    }
}
