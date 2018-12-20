package course;

import org.testng.annotations.Test;


/**
 * Created by qisi08 on 2018/12/4.
 */
public class Arrays {
    @Test
    public void Test1(){
        // 定义一个长度为 3 的字符串数组，并赋值初始值
        String[] hobbys = { "sports", "game", "movie"};
        System.out.println("循环输出数组中元素的值：");
        // 使用循环遍历数组中的元素
        for (int i=0;i<hobbys.length;i++){// 数组名.length  用于获取数组的长度
            System.out.println(hobbys[i]);
        }
    }

    /**
     * 任务要求：
     1、 定义一个整型数组，并赋初值 61, 23, 4, 74, 13, 148, 20
     2、 定义变量分别保存最大值、最小值、累加值和平均值，并假设数组中的第一个元素既为最大值又为最小值
     3、 使用 for 循环遍历数组中的元素，分别与假定的最大值和最小值比较。如果比假定的最大值要大，则替换当前的最大值；如果比假定的最小值要小，则替换当前的最小值
     4、 循环执行过程中对数组中的元素进行累加求和
     5、 循环结束根据累加值计算平均值，并打印输出相关内容
     */
    @Test
    public void Test2() {
        int[] nums = new int[]{61, 23, 4, 74, 13, 148, 20};// 定义一个整型数组，并赋初值
        int max = nums[0];// 假定最大值为数组中的第一个元素
        int min = nums[0];// 假定最小值为数组中的第一个元素
        double sum = 0;// 累加值
        double avg = 0;// 平均值

        for (int i = 0; i < nums.length; i++) {// 循环遍历数组中的元素
            // 如果当前值大于max，则替换max的值
            if (nums[i] > max) {
                max = nums[i];
            }// 如果当前值小于min，则替换min的值
            if (nums[i] > min) {
                min = nums[i];

            }
            sum = sum + nums[i];// 累加求和
        }
        avg = sum / nums.length;
        System.out.println("数组中的最大值：" + max);
        System.out.println("数组中的最小值：" + min);
        System.out.println("数组中的平均值：" + avg);
    }

    @Test
    public void Test3(){
        // 定义一个字符串数组
        String[] hobbies = { "sports", "game", "movie" };
        // 使用Arrays类的sort()方法对数组进行排序
        java.util.Arrays.sort(hobbies);
        // 使用Arrays类的toString()方法将数组转换为字符串并输出
        System.out.println(java.util.Arrays.toString(hobbies));
    }


    /**
     * 遍历数组集合
     *   for(元素类型 元素变量 ：遍历对象){
     *   执行的代码}
     */
    @Test
    public void Test4() {
        // 定义一个整型数组，保存成绩信息
        int[] scores = { 89, 72, 64, 58, 93 };
        java.util.Arrays.sort(scores);
        for (int i =1;i<scores.length;i++){
           System.out.println(scores[i]);
        }
        for (int score:scores){
            System.out.println(score);
        }

    }
    @Test//二维数组
    public void Test5(){
        //定义一个两行三列的二维数组并赋值
        int[][] num ={{1,2,3},{4,5,6}};
        //定义行
        for (int i=0;i<num.length;i++){
            for (int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
    }

    @Test
    public void Test6(){
        // 定义两行三列的二维数组并赋值
        String[][] names ={{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
        // 通过二重循环输出二维数组中元素的值
        for (int i=0;i<names.length;i++){
            for (int j=0;j<names[i].length;j++){
                System.out.println(names[i][j]);
            }
            System.out.println();
        }


    }





}
