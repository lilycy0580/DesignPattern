package com.dp.use_pattern.iterator;

import com.dp.use_pattern.project.IProject;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ProjectIterator implements IProjectIterator{

    private ArrayList<IProject> projectsList = new ArrayList<IProject>();

    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projectsList) {
        this.projectsList = projectsList;
    }

    @Override
    public boolean hasNext() {
        boolean b = true;
        if(this.currentItem>=projectsList.size() || this.projectsList.get(this.currentItem)==null){
            b=false;
        }
        return b;
    }

    @Override
    public Object next() {
        return (IProject)this.projectsList.get(this.currentItem++);
    }

    @Override
    public void remove() {
        // doSomething
    }

}
