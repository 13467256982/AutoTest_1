package com.course.testng.suite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 * Created by qisi08 on 2018/11/13.
 */
public class PayTest {
   @Test
    public void paySuccess(){
        System.out.println("支付宝支付成功");
    }

}
