package com.dp.no_pattern.client;

import com.dp.no_pattern.group.Group;
import com.dp.no_pattern.group.PageGroup;
import com.dp.no_pattern.group.RequirementGroup;

public class Client {


    public static void main(String[] args) {
        System.out.println("----------------客户增加一条需求--------------");
        Group group = new RequirementGroup();
        group.find();
        group.add();
        group.plan();

        System.out.println("----------------客户删除一个页面--------------");
        Group group1 = new PageGroup();
        group1.find();
        group1.delete();
        group1.plan();


    }


}
