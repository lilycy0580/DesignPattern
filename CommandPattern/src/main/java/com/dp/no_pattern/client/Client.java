package com.dp.no_pattern.client;

import com.dp.no_pattern.group.Group;
import com.dp.no_pattern.group.concrete_group.PageGroup;
import com.dp.no_pattern.group.concrete_group.RequirementGroup;

public class Client {


    public static void main(String[] args) {
        System.out.println("----------------客户找到产品组:增加一条需求--------------");
        Group group = new RequirementGroup();
        group.find();
        group.add();
        group.plan();

        System.out.println("----------------客户找到美工组:删除一个页面--------------");
        group = new PageGroup();
        group.find();
        group.delete();
        group.plan();


    }


}
