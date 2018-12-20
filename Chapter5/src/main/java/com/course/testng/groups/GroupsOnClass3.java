package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by qisi08 on 2018/11/22.
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1运行");
        }
    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher2运行");
    }
}
