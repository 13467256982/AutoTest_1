package imooc;

import org.testng.annotations.Test;

/**
 * Created by qisi08 on 2018/12/5.
 */
public class TelPhone {
    //属性（成员变量）有什么
    float screen;
    float cpu;
    float mem;
    int var=30;

    //方法 干什么
    void call() {
        int var=40;
        System.out.println("var:"+var);
        System.out.println("TelPhone有打电话的功能");
    }

    void sendMessage() {
        System.out.println("var:"+var);
        System.out.println("screen:" + screen + "cpu:" + cpu + "mem:" + mem + "TelPhone有发短信的功能");
    }

    @Test
    public void Test() {
        TelPhone phone = new TelPhone();
        phone.call();
        /*phone.sendMessage();
        //给实例变量赋值
        phone.screen=5.0f;
        phone.cpu=1.4f;
        phone.mem=2.0f;
        phone.sendMessage();*/

    }
}