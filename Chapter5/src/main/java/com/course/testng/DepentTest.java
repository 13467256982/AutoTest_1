package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by qisi08 on 2018/11/27.
 */
public class DepentTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
