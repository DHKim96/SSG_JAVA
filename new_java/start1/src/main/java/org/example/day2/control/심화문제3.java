package org.example.day2.control;

import java.util.Scanner;

public class 심화문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("먹고 싶은 음식 : ");
            String food = sc.nextLine();
            System.out.print("어디로 갈까?(y/n) : ");
            char answer = sc.nextLine().charAt(0);
            if (answer == 'y') {
                String str = null;
                if(food.equals("아메리카노")) str = "카페로 가세요.";
                else if(food.equals("모르겠어")) str = "그러면 물을 마셔요.";
                else str = "순두부 열라면 드세요.";
                System.out.println(str);
            } 

            System.out.println("========================");
            System.out.print("당신의 나이는 : ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("나의 내년 나이는?(y/n) : ");
            answer = sc.nextLine().charAt(0);
            if (answer == 'y') System.out.print("당신은 내년에 " + (age + 1) + "세가 됩니다.");

            System.out.println("========================");
            System.out.print("나의 국어 점수 : ");
            int korean = sc.nextInt();
            System.out.print("나의 수학 점수 : ");
            int math = sc.nextInt();
            sc.nextLine();
            System.out.print("두 과목 점수의 평균은?(y/n) : ");
            answer = sc.nextLine().charAt(0);
            if (answer == 'y') System.out.print("평균 점수는 " + (korean + math) / 2 + "점 입니다.");

            System.out.println("========================");
            System.out.print("계속 진행하시겠습니까?(y/n) : ");
            answer = sc.nextLine().charAt(0);
            if (answer == 'n') {
                sc.close();
                return;
            }
        }
    }
}
