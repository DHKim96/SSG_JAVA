package org.example.day19.test;

import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
    /*
    정수값 100개를 111~222까지 랜덤하게 스트림을 만들어서
    최대값, 최소값, 합계, 평균을 구하시오.
     */

        Random r = new Random();

        int max = r.ints(100, 111, 222).max().getAsInt();

        int min = r.ints(100, 111, 222).min().getAsInt();

        int sum = r.ints(100, 111, 222).sum();

        double avg = r.ints(100, 111, 222).average().getAsDouble();

        System.out.printf("최대값[%d] 최솟값[%d] 합계[%d] 평균[%d]", max, min, sum, (int)avg);
    }
}
