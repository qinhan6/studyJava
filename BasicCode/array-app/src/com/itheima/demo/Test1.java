package com.itheima.demo;

public class Test1 {
    public static void main(String[] args) {
        // 目标：掌握数组元素求最值
        int[] faceScores = {15, 9000, 10000, 20000, 9500, -5};

        // 1. 定义变量，保存最大值
        int max = faceScores[0];

        // 2. 遍历数组，获取每个元素
        for (int i = 1; i < faceScores.length; i++) {
            // 3. 判断元素是否大于max
            if (faceScores[i] > max) {
                // 4. 如果大于，替换max
                max = faceScores[i];
            }
        }
        System.out.println("最高颜值是：" + max);
    }
}
