package org.example.day2.control;

import java.util.Scanner;

public class 입력연습2 {
    public static void main(String[] args) {
        //수동 import ==> alt + 엔터
        Scanner sc = new Scanner(System.in);
        // 정수 2개 입력받아 첫 번째 숫자가 두 번째 숫자보다 큰 지 비교해서 출력하기
        System.out.print("첫 번째 정수 입력 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int b = sc.nextInt();

        System.out.println("크기 비교 결과 : " + (a > b));

        sc.close();
    }
}