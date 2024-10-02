package org.example.day5.review;

import java.util.Scanner;

public class 배열문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] seats = new boolean[10];

        System.out.println("=========== 좌석 예매 프로그램 =============");

        while(true){

            System.out.println("현재 좌석 상태 : ");

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < seats.length; i++) {
                sb.append(i + 1).append(":");

                if (seats[i]) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }

                sb.append(" ");
            }

            System.out.println(sb.toString());

            System.out.print("예매할 좌석 번호를 입력하세요(종료하려면 0 입력) : ");

            int seat = sc.nextInt();

            if(seat == 0) {
                System.out.println("============== 예매를 종료합니다.===============");

                int count = 0;
                int cost = 8000;

                for (int i = 0; i < seats.length; i++) {
                    if (seats[i]) {
                        count++;
                    }
                }

                System.out.printf("예매된 좌석 수 : %d개\n", count);
                System.out.printf("총 예매 금액 : %d원\n", cost * count);

                sc.close();

                return;
            }

            if (seats[seat - 1]) {
                System.out.println("이미 예약된 좌석입니다. 다른 좌석을 예매해주세요.\n");
            } else {
                seats[seat - 1] = true;
                System.out.printf("%d번 좌석이 예매되었습니다.\n\n", seat);
            }
        }



    }
}
