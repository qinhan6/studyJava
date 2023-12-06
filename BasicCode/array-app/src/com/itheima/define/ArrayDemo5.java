package com.itheima.define;

public class ArrayDemo5 {
    public static void main(String[] args) {
        // 目标：掌握点工艺数组的方式二： 动态初始化数组
        // 1. 数据类型[] 数组名 = new 数据类型[数组的长度];
        int[] ages = new int[3]; // ages = [0, 0, 0]

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        // 2. 给数组中的元素赋值
        ages[0] = 18;
        ages[1] = 28;
        ages[2] = 38;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        // int[] arr = new int[5]{11, 22, 33, 44, 55}; 报错

        System.out.println("------------------");

        char[] chars = new char[3];
        System.out.println((int)chars[0]);
        System.out.println((int)chars[1]);
        System.out.println((int)chars[2]);

        System.out.println("------------------");

        double[] sores = new double[80];
        System.out.println(sores[0]);
        System.out.println(sores[1]);
        System.out.println(sores[79]);

        System.out.println("------------------");

        boolean[] flags = new boolean[100];
        System.out.println(flags[0]);
        System.out.println(flags[99]);

        System.out.println("------------------");

        String[] names = new String[80];
        System.out.println(names[0]);
        System.out.println(names[79]);
    }
}
