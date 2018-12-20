package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by qisi08 on 2018/11/21.
 */

public class IgnoreTest {
    @Test
    public  void ignore1(){
        System.out.println("ignore1 执行了！");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行！");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行！");
    }
}
