package imooc;

import org.testng.annotations.Test;

/**
 * Created by qisi08 on 2018/12/5.
 */
public class TelPhone2 {

    /*//无参的构造方法
    public TelPhone2() {
        System.out.println("无参的构造方法执行了！");
    }*/
   /* public static void main(String[] args) {
    TelPhone2 phone = new TelPhone2();

    }
*/


    float screen;
    float cpu;
    float mem;

    //有参的构造方法
    public  TelPhone2(float newScreen,float newCpu, float newMem) {
        if(newScreen<3.5f){
            System.out.println("您输入的参数有问题，自动赋值3.5");
            screen=3.5f;
        }else {
            screen = newScreen;
        }
        cpu = newCpu;
        mem = newMem;
        System.out.println("有参的构造方法执行了！");
    }
    public static void main(String[] args) {

        TelPhone2 phone2 = new TelPhone2(4.0f,2.0f,2.0f);



    }



}




