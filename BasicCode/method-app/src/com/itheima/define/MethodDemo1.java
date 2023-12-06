package com.itheima.define;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 目标：掌握定义方法的完整格式，要搞清楚使用方法的好处
        // 需求：加入现在很多程序员都要进行2个整数求和的操作

        // 1. 李工
        // int a = 10;
        // int b = 20;
        // int c = a + b;
        int res = sum(10, 20);
        System.out.println("和是：" + res);

        // 2. 张工
        // int a1 = 20;
        // int b1 = 30;
        // int c1 = a1 + b1;
        int res1 = sum(20, 30);
        System.out.println("和是：" + res1);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}
