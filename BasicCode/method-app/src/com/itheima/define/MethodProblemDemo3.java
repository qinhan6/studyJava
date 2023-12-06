package com.itheima.define;

public class MethodProblemDemo3 {
    public static void main(String[] args) {
        printHelloWorld();

        int res = sum(10, 20);
        System.out.println(res);

        // 不能在main方法里面定义
//        public static void printHelloWorld() {
//            for (int i = 0; i < 3; i++) {
//                System.out.println("Hello World!");
//            }
//        }
    }

    public static int sum (int a, int b) {
        int c = a + b;
        return c;
    }

    public static void printHelloWorld() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World!");
        }
    }
}
