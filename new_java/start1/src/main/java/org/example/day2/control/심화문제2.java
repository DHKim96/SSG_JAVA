package org.example.day2.control;

import java.util.Scanner;

public class 심화문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 게임 수
        int count = 1;
        int countOfFirst = 0;
        int countOfSecond = 0;

        while (true) {
            System.out.print("게임을 계속 하시겠습니까?(계속/종료) : ");
            String answer = sc.nextLine();

            if (answer.equals("종료")) {
                System.out.println("게임을 종료합니다.");
                sc.close();
                return;
            }

            count++;

            System.out.print("첫 번째 사람이 숫자(정수)를 입력하세요 : ");
            int a = sc.nextInt();
            System.out.print("두 번째 사람이 숫자(정수)를 입력하세요 : ");
            int b = sc.nextInt();

            String str = null;

            if (a > b) {
                str = "첫 번째 사람이 이겼습니다.";
                countOfFirst++;
            } else if (a < b) {
                str = "두 번째 사람이 이겼습니다.";
                countOfSecond++;
            } else {
                str = "비겼습니다.";
            }

            System.out.println("총 게임 수 : " + count);
            System.out.println("첫 번째 사람이 이긴 수 : " + countOfFirst);
            System.out.println("두 번째 사람이 이긴 수 : " + countOfSecond + "\n");

            sc.nextLine();
        }
    }
}
