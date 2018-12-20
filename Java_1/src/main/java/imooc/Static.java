package imooc;

/**
 * Created by qisi08 on 2018/12/6.
 * 使用 static 可以修饰变量、方法和代码块。
 */
public class Static {

    /*---------------------------------------------------------------
    //static修饰的变量为静态变量，所有类的对象共享 className
    static String className = "java开发一班";

    public static void main(String[] args) {
        //静态变量可直接使用雷鸣来访问，无需创建类的对象
        System.out.println(Static.className);

        //创建类的对象
        Static hello = new Static();
        //使用对象名来访问静态变量
        System.out.println(hello.className);

        //使用对象名的形式修改静态变量的值
        hello.className="java开发二班";
        System.out.println(Static.className);
    }
    */

   /* -----------------------------------------------
    public static void print(){
        System.out.println("欢迎您");
    }

    public static void main(String[] args) {
        //直接使用类名调用静态方法
        Static.print();

    //也可以通过对象名调用，当然更推荐使用类名调用的方法
        Static hello = new Static();
        hello.print();

     }*/



    /**-------------------------------------------------------
     * 方法
     */

   /* String name = "慕课网";//非静态变量name
    static String hobby = "imooc";//静态变量hobby

    //普通成员方法可以直接访问非静态变量和静态变量
    public void Test1(){
        System.out.println(name);
        System.out.println(hobby);
    }

    //静态方法中不能直接调用非静态方法，需要通过对象来访问非静态方法
    public static void Test2(){
        System.out.println("欢迎");

    }

    public static void main(String[] args) {
        Static hello = new Static();
        hello.Test1();//普通成员方法必须通过对象来调用
        Test2();//可以直接调用静态方法
    }*/




    /**-------------------------------------------------------------
     * 代码块,静态初始化块。
     * 静态初始化块只在类加载时执行，且只会执行一次，
     * 同时静态初始化块只能给静态变量赋值，不能初始化普通的成员变量。
     */
    int num1;
    int num2;
    static int num3;
    public Static(){//构造方法
        num1 = 91;
        System.out.println("通过构造方法为变量num1赋值");
    }{//初始化块
        num2 = 74;
        System.out.println("通过构造方法为变量num2赋值");
    }
    static {//静态初始化块
        num3 = 83;
        System.out.println("通过静态初始化块为静态变量num3赋值");
    }

    public static void main(String[] args) {
        Static hello = new Static();
        System.out.println(hello.num1);
        System.out.println(hello.num2);
        System.out.println(num3);
        Static hello2 = new Static();

    }




}
