package com.itheima.thisDemo;

public class Student {
    double score;

    public void printThis() {
        System.out.println(this);
    }

    public void printPass(double score) {
        if (this.score >= score) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
