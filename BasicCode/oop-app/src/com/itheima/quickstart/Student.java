package com.itheima.quickstart;

public class Student {
    String name; // 姓名
    double chinese; // 语文成绩
    double math; // 数学成绩

    public void printTotalScore() {
        System.out.println(name + "总成绩：" + (chinese + math));
    }

    public void printAverageScore() {
        System.out.println(name + "平均成绩：" + (chinese + math) / 2.0);
    }
}
