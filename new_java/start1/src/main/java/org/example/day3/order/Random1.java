package org.example.day3.order;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        // 의사(pseudo) 임시값
        Random r = new Random(100);
        // r.setSeed(100); 시드값


        for (int i = 0; i < 100; i++){
            int num1 = r.nextInt(); // +- 21억
            int num2 = r.nextInt(100); // 0 ~ 99 => bound 미만까지 숫자 랜덤 생성
            int num3 = r.nextInt(100) + 1; // 1 ~ 100
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }
    }
}
