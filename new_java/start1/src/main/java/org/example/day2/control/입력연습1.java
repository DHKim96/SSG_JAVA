package org.example.day2.control;

import java.util.Scanner;

public class 입력연습1 {
    public static void main(String[] args) {
        //수동 import ==> alt + 엔터
        Scanner sc = new Scanner(System.in);
        String name = sc.next();//한 단어만 입력, 홍길동
        int age = sc.nextInt(); //String --> int
        double w = sc.nextDouble(); //String --> double
        System.out.println(name + " " + age + " " + w);
        sc.close();
    }
}