package com.course.testng;

import org.testng.annotations.*;

/**
 * Created by qisi08 on 2018/11/13.
 */
public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("Test1");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是测试之前运行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是测试之后运行");
    }
    @Test
    public void testCase2(){
        System.out.println("***Test2***");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("***BeforeClass这是类运行之前运行的方法***");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("***AfterClass这是类运行之后运行的方法***");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }



}
