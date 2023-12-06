package com.itheima.demo;

public class Test2 {
    public static void main(String[] args) {
        // 目标： 完成数组反转
        int[] arr = {10, 20, 30, 40, 50};

        // 定义一个循环，设计2个变量，一个在钱，一个在后
        for (int i = 0, j = arr.length -1; i < j; i++, j--) {
            // 交换2个变量的值
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
