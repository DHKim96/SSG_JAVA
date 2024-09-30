package org.example.day3.order;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        // 생성 => ram
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력>> ");
        int age = sc.nextInt(); // 모든 입력은 타입을 컴퓨터는 String으로 인식. 따라서 int로 형변환
        System.out.print("아침을 먹었는지 입력(true/false)?>> ");
        boolean result = sc.nextBoolean();

        // 처리 => cpu
        int nextAge = ++age;

        String str = null;
        if(result){
            str = "점심을 조금 먹어도 되겠네요.!";
        } else {
            str = "점심을 많이 먹어야 되겠네요.!";
        }

        //출력
        System.out.println("내년 나이는 " + nextAge + "세 입니다.");
        System.out.println(str);

        sc.close();
    }
}
