package com.itheima.constructor;

public class Student {
    String name;
    double score;

    private double score1; // private 对外隐藏

    public void setScore (double score1) {
        if (score1 < 0 || score1 > 100) {
            System.out.println("成绩不合法");
            return;
        }
        this.score1 = score1;
    }

    public double getScore () {
        return score1;
    }

    public Student () {
        // 无参数构造方法
        System.out.println("无参数构造器被触发执行了");
    }

    public Student (String name, double score) {
        // 有参数构造方法
        System.out.println("有参数构造器被触发执行了");
        this.name = name;
        this.score = score;
    }
}
