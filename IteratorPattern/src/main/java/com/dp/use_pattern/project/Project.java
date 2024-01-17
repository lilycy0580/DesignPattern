package com.dp.use_pattern.project;

import com.dp.use_pattern.iterator.IProjectIterator;
import com.dp.use_pattern.iterator.ProjectIterator;

import java.util.ArrayList;

public class Project implements IProject {

    private ArrayList<IProject> projectList = new ArrayList<IProject>();

    private String name ="";

    private int num = 0;

    private int cost = 0;

    public Project() {
    }

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    // 增加项目
    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name,num,cost));
    }

    // 得到项目信息
    @Override
    public String getProjectInfo() {
        return "项目名称是："+this.name+"\t 项目人数："+this.num+"\t项目费用："+this.cost;
    }

    // 生成一个遍历对象
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
