package com.dp.no_pattern;

public class Project implements IProject {


    private String name = "";

    private int num = 0;

    private int cost = 0;

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public String getProjectInfo() {
        String info="";
        return info + "项目名称是："+this.name+"\t 项目人数："+this.num+"\t项目费用："+this.cost;
    }
}
