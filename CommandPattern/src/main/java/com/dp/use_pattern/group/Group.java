package com.dp.use_pattern.group;

public abstract class Group {

    // 先找到这个组
    public abstract void find();

    // 增加功能
    public abstract void add();

    // 删除功能
    public abstract void delete();

    // 修改功能
    public abstract void change();

    // 给出变更计划
    public abstract void plan();

    public void rollback(){
        // 根据日志回滚
    }

}
