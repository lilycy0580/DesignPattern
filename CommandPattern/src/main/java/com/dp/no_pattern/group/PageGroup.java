package com.dp.no_pattern.group;

public class PageGroup extends Group{
    @Override
    public void find() {
        System.out.println("找到美工组");
    }

    @Override
    public void add() {
        System.out.println("美工增加页面");
    }

    @Override
    public void delete() {
        System.out.println("美工删除页面");
    }

    @Override
    public void change() {
        System.out.println("美工修改页面");
    }

    @Override
    public void plan() {
        System.out.println("客户给出页面变更计划");
    }
}
