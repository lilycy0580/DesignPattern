package com.dp.use_pattern.project;

import com.dp.use_pattern.iterator.IProjectIterator;

public interface IProject {

    public void add(String name,int num, int cost);

    public String getProjectInfo();

    public IProjectIterator iterator();




}
