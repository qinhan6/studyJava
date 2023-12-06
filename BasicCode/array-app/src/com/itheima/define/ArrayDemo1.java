package com.itheima.define;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 目标：静态初始化数组

        // 1. 数组类型[] 数组名 = new 数据类型[]{}
        int[] ages = new int[]{12, 24, 36};
        double[] scores = new double[]{89.9, 99.5, 59.5, 88};
        System.out.println(ages[0]);
        System.out.println(scores[0]);

        // 2. 简化格式
        // 数据类型[] 数组名 = {}
        int[] ages2 = {12, 24, 36};
        double[] scores2 = {89.9, 99.5, 59.5, 88};

        // 3. 数据类型[] 数组铭 也可以写成 数据类型 数组名[]
        int ages3[] = {12, 24, 36};
        double scores3[] = {89.9, 99.5, 59.5, 88};
    }
}
