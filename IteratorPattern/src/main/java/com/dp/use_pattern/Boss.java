package com.dp.use_pattern;

import com.dp.use_pattern.iterator.IProjectIterator;
import com.dp.use_pattern.project.IProject;
import com.dp.use_pattern.project.Project;

public class Boss {

    public static void main(String[] args) {

        IProject project = new Project();
        project.add("星球大战项目",10,100000);
        project.add("扭转时空项目",10,1000);
        project.add("超人改造项目",10,10);
        project.add("超人改造项目",10,10000000);
        for (int i = 4; i < 10; i++) {
            project.add("第"+i+"个项目",i*5,i*100);
        }
        IProjectIterator iterator = project.iterator();
        while(iterator.hasNext()){
            IProject temp = (IProject) iterator.next();
            System.out.println(temp.getProjectInfo());
        }

    }
}
