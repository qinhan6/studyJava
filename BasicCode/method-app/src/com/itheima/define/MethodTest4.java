package com.itheima.define;

public class MethodTest4 {
    public static void main(String[] args) {
        // 目标： 掌握设计方法的技巧
        int res = add(5);
        System.out.println("1-5的和是：" + res);

        int res2 = add(100);
        System.out.println("1-100的和是：" + res2);

        System.out.println("--------------------");

        judge(10);
        judge(7);
    }

    public static int add(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void judge(int number) {
        if (number % 2 == 0) {
            System.out.println(number + "偶数");
        } else {
            System.out.println(number + "奇数");
        }
    }
}
