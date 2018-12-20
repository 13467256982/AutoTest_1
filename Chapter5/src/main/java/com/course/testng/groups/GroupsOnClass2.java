package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by qisi08 on 2018/11/22.
 */
@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass2中的stu1运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass2中的stu2运行");
    }
}
