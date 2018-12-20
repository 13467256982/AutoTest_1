package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by qisi08 on 2018/11/22.
 * 什么时候会用到异常测试
 * 在我们期望结果为某一个异常的时候
 * 比如：我们传入某些不合法的参数，程序抛出的异常
 * 也就是说我们的语气结果就是这个异常
 */
public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是成功的异常测试");
        throw new RuntimeException();
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess1(){
        System.out.println("1");
        throw new RuntimeException();
    }
}
