package course;

import org.testng.annotations.Test;

import java.util.*;
import java.util.Arrays;

/**
 * Created by qisi08 on 2018/12/5.
 * 定义Java中的方法  语法：
 *    访问修饰符 返回值类型 方法名（参数列表）{
 *        方法体}
 */
public class Method {

    @Test //无参无返回值方法
    public void Test1() {
        Method test = new Method();    // 创建对象
        test.print();//对象名.方法名();
    }

    //定义了一个方法名为 print 的方法，实现输出信息功能
    public void print() {
        System.out.println("Hello World");
    }


    //无参带返回值方法
    @Test
    public void Test2() {
        Method test = new Method();
        int sum = test.calcSum();//对象名.方法名();
        System.out.println("两数之和为：" + sum);
    }

    public int calcSum() {
        int a = 5;
        int b = 12;
        int sum = a + b;
        return sum;
    }


    @Test
    public void Test3() {
        Method test = new Method();
        int maxScore = test.getMaxAge();
        System.out.println(maxScore);
    }

    public int getMaxAge() {
        int[] ages = {18, 23, 21, 19, 25, 29, 17};
        int max = ages[0];
        for (int i = 0; i < ages.length; i++) {
            if (max < ages[i]) {
                max = ages[i];
            }
        }
        return max;
//        java.util.Arrays.sort(ages);
//        int max = ages[ages.length-1];
//        return max;
    }


    @Test//带参无返回值方法
    public void Test4() {
        //创建对象
        Method test = new Method();
        test.calcAvg(94, 81);

    }

    public void calcAvg(double score1, double score2) {
        double avg = (score1 + score2) / 2;
        System.out.println("平均分" + avg);
    }

    @Test//带参带返回值方法
    public void Test5() {
        Method test = new Method();
        int[] scores = {79, 52, 98, 81};
        int count = test.sort(scores);
        System.out.println("共有" + count + "个成绩");

    }

    public int sort(int scores[]) {
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        return scores.length;
    }

    //JAVA中的方法重载
    public void show() {
        System.out.println("welcome");
    }

    public void show(String name) {
        System.out.println("welcome" + name);
    }

    public void show(String name, int age) {
        System.out.println(name + "今年" + age + "岁了");
    }

    public void show(int age, String name) {
        System.out.println("今年" + age + "岁的名字是" + name);
    }

    @Test
    public void Test7() {
        Method test = new Method();
        test.show();
        test.show("jia");
        test.show("jia", 12);
        test.show(12, "jia");
    }

    /**
     * 一、 定义一个带参带返回值的方法，实现输出随机数数组
     * 提示：
     * 1、 定义一个带参带返回值的方法，通过参数传入数组的长度，返回值为赋值后的数组
     * 2、 创建指定长度的整型数组
     * 3、 使用 for 循环遍历数组，通过 Math.random( ) 生成随机并给数组成员赋值
     * 4、 使用 return 返回赋值后的数组
     * 二、 完成 main 方法
     * 提示：
     * 1、 调用自定义方法，保存方法执行后返回的数组
     * 2、 使用 Arrays.toString( ) 将数组转换为字符串并输出，注意导入 java.util.Arrays;
     */
    @Test
    public void Test8() {
        Method test = new Method();
        int[] nums = test.getArray(8);
        System.out.println(Arrays.toString(nums));

    }

    public int[] getArray(int length) {
        int[] nums = new int[length];
        //// 循环遍历数组赋值
        for (int i = 0; i < nums.length; i++) {
            // 产生一个100以内的随机数，并赋值给数组的每个成员
            nums[i] = (int) (Math.random() * 100);
        }
        return nums;// 返回赋值后的数组

    }

    @Test
    public void Test9() {
        int[] scores = {89, -23, 64, 91, 119, 52, 73};
        Method test = new Method();
        test.sort1(scores);
    }

    public int sort1(int [] scores) {
        Arrays.sort(scores); // 对数组进行排序
        int scoreNum = 0; // 定义有效成绩个数
        System.out.println("考试成绩的前三名为:");


        // 倒序遍历数组,并通过有效成绩个数判断前三名
        for (int i = scores.length - 1; i >= 0 && scoreNum < 3; i--) {

            if (scores[i] < 0 || scores[i] > 100){
                continue;
            }scoreNum++;

            System.out.println(scores[i]);// 每次循环输出有效成绩
        }return scoreNum;
    }

}

