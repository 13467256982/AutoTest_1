package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by qisi08 on 2018/11/27.
 */
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name = "+name+"; age ="+age);
    }
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o =new Object[][]{
                {"zhangsan",10},
                {"lisi",12},
                {"wangwu",20}
        };
        return o;
    }

    @Test
    public void test1(String name,int age){

    }
    @Test
    public void test2(String name,int age){

    }
}
