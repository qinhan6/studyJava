package com.itheima.define;

public class ArrayTest4 {
    public static void main(String[] args) {
        // 目标：完成对数组的求和
        int[] money = {16, 26, 36, 6,100 };

        // 2. 便利数组中的每个数据
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println("总金额为：" + sum);
    }
}
