package imooc;

/**
 * Created by qisi08 on 2018/12/6.
 * 封装
 */
public class Encapsulation {
    private float screen;
    private float cpu;
    private float mem;

    public float getScreen(){
        return screen;
    }
    public void setScreen(float newScreen){
        screen =newScreen;
    }

    //有参的构造方法
    public  Encapsulation(float newScreen,float newCpu, float newMem) {
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

        TelPhone2 phone = new TelPhone2(5.0f,2.0f,2.0f);
        phone.setScreen


    }




}
