package com.itheima.define;

import java.util.Scanner;

public class ArrayTest6 {
    public static void main(String[] args) {
        // 目标：完成评委打分的案例
        // 1. 定义一个数组，用来存储评委的分数
        double[] sores = new double[6];

        Scanner sc = new Scanner(System.in);

        // 2. 遍历数组中的每个位置，录入评委的分数
        for (int i = 0; i < sores.length; i++) {
            System.out.println("请您输入第" + (i + 1) + "个评委的分数：");
            double score = sc.nextDouble();
            sores[i] = score;
        }

        // 3.遍历数组中的每个元素进行求和
        double sum = 0;
        for (int i = 0; i < sores.length; i++) {
            sum += sores[i];
        }
        System.out.println("选手最终得分是：" + sum / sores.length);
    }
}
