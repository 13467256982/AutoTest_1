package course;

import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * Created by qisi08 on 2018/11/29.
 */
public class Yuju {
    @Test//if条件语句
    public void Test1(){
        int score=97;
        if (score>90){
            System.out.println("奖励一个手机");
        }
    }
    @Test//if ... else
    public void Test2(){
        int one = 21;
        if (one%2==0){
            System.out.println("one是偶数");
        }else {
            System.out.println("one是奇数");
        }
    }
    @Test//多重 if 语句
    public void  Test3(){
        int age = 18;
        if (age>60){
            System.out.println("老年");
        }else if (age>=40){
            System.out.println("中年");
        }else if (age>=18){
            System.out.println("少年");
        }else {
            System.out.println("童年");
        }
    }
    @Test//嵌套 if 语句
    public void Test4(){
        String today="周末";
        String weather="晴朗";
        if (today.equals("周末")){
            if (weather.equals("晴朗")){
                System.out.println("去室外游乐场玩");
            }else {
                System.out.println("去室内游乐场游玩");
            }
        }else {
            System.out.println("去上班");
        }
    }
    @Test
    public void Test5(){
        int score = 94;
        String sex = "女";
        if (score>80){
            if (sex.equals("女")){
                System.out.println("进入女子组决赛");
            }else {
                System.out.println("进入男子组决赛");
            }
        }else {
            System.out.println("淘汰");
        }
    }
    @Test
    /*
      1、 switch 后面小括号中表达式的值必须是整型或字符型
      2、 case 后面的值可以是常量数值，如 1、2；也可以是一个常量表达式，如 2+2 ；但不能是变量或带有变量的表达式，如 a * 2
      3、 case 匹配后，执行匹配块里的程序代码，如果没有遇见 break 会继续执行下一个的 case 块的内容，直到遇到 break 语句或者 switch 语句块结束
      4、 可以把功能相同的 case 语句合并起来
      5、 default 块可以出现在任意位置，也可以省略
    */
    public void Test6(){
        int num = 1;
        switch (num){
            case 1:
                System.out.println("奖励笔记本");
                break;
            case 2:
                System.out.println("奖励 手机");
                break;
            case 3:
                System.out.println("奖励移动电源");
                break;
            default:
                System.out.println("奖励U盘");
        }
    }
    @Test//循环语句之 while
    public void Test7(){
        int i =1;
        while (i<=5){
            System.out.println("1");
            i++;
        }
    }
    @Test//循环语句之 do...while
    /*
    实现功能：计算 50 以内（包括 50 ）的偶数之和
    实现思路：首先定义一个变量 sum ，用来保存所有偶数的和，
              然后定义一个变量 num 代表 1--50 之间的偶数，值从 2 开始，每次循环执行时将 num 的值累加保存在变量 sum 中，
              并且将 num 值加 2 (偶数嘛，你懂得哈~~)，
              只要 num 的值在 1--50 之内就重复执行该循环
     */
    public void Test8(){
        int sum =0;// 保存 1-50 之间偶数的和
        int num =2;// 代表 1-50 之间的偶数
        do {//循环操作
            sum = num + sum;//实现累加求和
            num = num + 2;// 每执行一次将数值加2，以进行下次循环条件判断
        }while (num<=50);//判断条件
        System.out.println(" 50以内的偶数之和为：" + sum );
    }
    @Test//循环语句之 for
    public void Test9(){
        int sum =0;// 保存不能被3整除的数之和
        // 循环变量 i 初始值为 1 ,每执行一次对变量加 1，只要小于等于 100 就重复执行循环
        for (int i = 1;i<=100;i++){
            // 变量 i 与 3 进行求模（取余），如果不等于 0 ，则表示不能被 3 整除
            if (i % 3 !=0){
                sum = sum +i;// 累加求和
            }
        }System.out.println("1到100之间不能被3整除的数之和为：" + sum);

    }

    @Test//循环跳转语句之 break
    /*
    实现功能：循环将 1 到 10 之间的整数相加，如果累加值大于 20，则跳出循环，并输出当前的累加值。
    实现思路：定义一个变量 sum 保存累加值，定义一个变量 i 保存 1 至 10 之间的整数，在循环中进行累加求和，
    同时判断累加值是否大于 20 ，当大于 20 时输出当前的累加值并退出循环。
     */
      public void Test10(){
          int sum = 0;
          for (int i = 1;i<=10;i++){
              // 每次循环时累加求和
              sum = sum + i;
              if (sum > 20 ){
                  System.out.print("当前的累加值为:" + sum);
                  break;//退出循环
              }
          }
    }


    @Test//循环跳转语句之 continue
    public void Test11(){
          int sum = 0;
          for (int i = 0;i<=10;i++){

              if (i %2 !=0){
                  continue;
              }sum = sum +i;
          }
        System.out.println("1到10之间的所有偶数的和为："+sum);
    }
    //循环语句之多重循环
    @Test//使用 * 打印长方形
    public void Test12(){
        //外层循环控制打印的行数
        for (int i =1;i<=3;i++){
            //内层循环控制每行打印“*”号数
            for (int j =1;j<=8;j++){
                System.out.print("*");
            }
            //每行打印完毕换行
            System.out.println();
        }
    }
    //使用 * 打印直角三角形
    @Test
    public void Test13(){
        for (int i =1;i<=3;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            //每行打印完毕换行
            System.out.println();
        }
    }

    //使用 * 打印三角形
    @Test
    public void Test14(){
        for (int i=1;i<=5;i++){
            for (int j=0;j<=5-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    //使用 * 打印三角形
    @Test
    public void Test15(){
        for (int i = 0;i < 5; i++){
            for (int j = 0;j <= 5 - i;j++){//输出空格随着循环是递减的
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){//输出*号随着外循环是递增的,当k<=i时 只打印三角形的一半,首先k是从0开始的
                System.out.print("* ");//此处*号后面加了一个空格
            }
            System.out.println();
        }
    }
    @Test//倒三角
    public void Test16() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++){//输出*随着循环是递增的
                System.out.print(" ");
            }
            for (int k = 0; k <=(3-i)*2; k++){//输出空格随着外循环是递减的
                System.out.print("*");
            }
            System.out.println();
        }
    }
    @Test
    public void Test17(){
        int num =999;
        int count =0;
        do
        {
            count++;
            num=num/10;
        }
        while(num >0);
        System.out.println("它是个"+count+"位的数！");

    }
    @Test
    public void Test18(){
        int score = 53; //加分前的成绩
        int count = 0;//加分的次数
        System.out.println("加分前的成绩："+score);

        // 只要成绩小于60，就循环执行加分操作，并统计加分次数
       /* for (;score<60;score++){
            count++;
        }*/
       while (score<60){
           score++;
           count++;
       }
        System.out.println("加分后的成绩："+score);
        System.out.println("共加了"+count+"次！");
    }


  /*public static void main(String[] args) {

        Scanner input =new Scanner(System.in);//创建Scanner对象
        //print:不会换行，println会换行
        System.out.print("请输入考试前的成绩:");
        int score = input.nextInt(); //获取用户输入的成绩并保存在变量中
        int count = 0;//加分的次数
        System.out.println("加分前的成绩："+score);

        // 只要成绩小于60，就循环执行加分操作，并统计加分次数
      *//* for (;score<60;score++){
            count++;
        }*//*
        while (score<60){
            score++;
            count++;
        }
        System.out.println("加分后的成绩："+score);
        System.out.println("共加了"+count+"次！");
    }*/

    public static void main(String[] args) {
        int classNum = 3;//班级的数量
        int stuNum = 4;//学生的数量
        double sum = 0;//成绩总和
        double avg = 0;//成绩平均分
        Scanner input = new Scanner(System.in);//创建Scanner对象
        for (int i=1;i<=classNum;i++){//外层循环控制班级的数量
            sum = 0;//成绩总和为0
            System.out.println("***请输入第"+i+"个班级的成绩***");
            for (int j=1;j<=stuNum;j++){
                System.out.println("请输入第"+j+"个学生的成绩");
                int score =input.nextInt();
                sum = sum + score;//成绩累加求和
            }
            avg = sum /stuNum;//计算平均分
            System.out.println("第"+i+"个班级的平均分为："+avg);
        }

    }









}
