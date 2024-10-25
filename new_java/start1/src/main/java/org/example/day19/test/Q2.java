package org.example.day19.test;

import java.util.Random;

public class Q2 {
    /*
        실수값 200개를 11.1 ~ 55.5 까지 랜덤하게 스트림을 만들어
        전체 개수, 맨 앞에 있는 값, 평균을 구하시오
     */
    public static void main(String[] args) {
        Random r = new Random();

        long count = r.doubles(200, 11.1, 55.5).count(); // 메서드 타입이 long 임!

        double first = r.doubles(200, 11.1, 55.5).findFirst().orElse(0.0);

        double avg = r.doubles(200, 11.1, 55.5)
                                .average().orElse(0.0);

        System.out.printf("갯수 : %d / 맨 앞 값 : %.2f / 평균 : %d", count, first, (int)avg);




    }
}
