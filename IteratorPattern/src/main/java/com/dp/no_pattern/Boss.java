package com.dp.no_pattern;

import java.util.ArrayList;

public class Boss {


    public static void main(String[] args) {

        ArrayList<IProject> arrayList = new ArrayList<IProject>();
        arrayList.add(new Project("星球大战项目",10,100000));
        arrayList.add(new Project("扭转时空项目",10,1000));
        arrayList.add(new Project("超人改造项目",10,10));
        arrayList.add(new Project("超人改造项目123",10,10000000));
        for (int i = 4; i < 10; i++) {
            arrayList.add(new Project("第"+i+"个项目",i*5,i*100));
        }

        for(IProject project:arrayList){
            System.out.println(project.getProjectInfo());
        }
    }

}
