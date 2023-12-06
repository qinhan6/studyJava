package com.itheima.define;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 目标：掌握按照方法解决的实际业务需求不同，设计出合理的方法形式来解决问题
        printHelloWorld(3);

        System.out.println("------------------------");

        printHelloWorld(6);
    }

    /**
        有参数，无返回值
     */
    public static void printHelloWorld(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World!");
        }
    }
}
