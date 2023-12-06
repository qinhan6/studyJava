package com.itheima.demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 目标： 完成随机排名
        // 1. 定义一个动态初始化的数组用于存储5名员工的工号
        int[] codes = new int[5];

        // 2. 提示用户录入5名员工的工号
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入第" + (i + 1) + "名员工的工号：");
            codes[i] = sc.nextInt();
        }

        // 3. 打乱数组中元素的顺序
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            // 每遍历到一个数据，都随机一个数组索引范围内的值，然后让当前遍历的数据与该索引位置的值交换
            int index = r.nextInt(codes.length);
            // 定义一个临时变量记住index位置的值
            int temp = codes[index];
            // 把i位置的值赋值给index位置处
            codes[index] = codes[i];
            // 把临时变量的值赋值给i位置
            codes[i] = temp;
        }

        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + " ");
        }
    }
}
