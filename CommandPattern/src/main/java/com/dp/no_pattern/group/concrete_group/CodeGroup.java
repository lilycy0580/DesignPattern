package com.dp.no_pattern.group.concrete_group;

import com.dp.no_pattern.group.Group;

// 研发组
public class CodeGroup extends Group {
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
        System.out.println("客户给出研发变更计划");
    }
}
