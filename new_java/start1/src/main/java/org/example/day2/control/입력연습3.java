package org.example.day2.control;

import java.util.Scanner;

public class 입력연습3 {
    public static void main(String[] args) {
        //수동 import ==> alt + 엔터
        Scanner sc = new Scanner(System.in);
        // 정수 2개 입력받아 첫 번째 숫자가 두 번째 숫자보다 큰 지 비교해서 출력하기
        System.out.print("나의 이름은? : ");
        String name = sc.next();

        System.out.print("나의 키는? : ");
        double height = sc.nextDouble();

        System.out.print("나의 몸무게는? : ");
        double weight = sc.nextDouble();

        System.out.print("나는 저녁을 먹었나요? : ");
        boolean isTrue = sc.nextBoolean();
        sc.nextLine();

        System.out.print("나의 좌우명은? : ");
        String str = sc.nextLine();
        
        System.out.println("내 이름은 " + name + "입니다.");
        System.out.println("내 내년 키는 " + height + "입니다.");
        System.out.println("내 내년 몸무게는 " + weight + "입니다.");
        System.out.println("나는 저녁을 " + isTrue + "했습니다.");
        System.out.println("나의 좌우명은 " + str + "입니다.");
        
        sc.close();
    }
}