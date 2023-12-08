package com.itheima.constructor;

public class Test {
    public static void main(String[] args) {
//        Student s = new Student("波仔", 99);
//
//        Student s2 = new Student("小黑", 59);
//        System.out.println(s2.name);
//        System.out.println(s2.score);

        Student s1 = new Student();
        s1.setScore(99);
        System.out.println(s1.getScore());
    }
}
