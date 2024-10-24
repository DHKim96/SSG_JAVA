package org.example.day18.람다식.test;

import java.util.Scanner;

public class LambdaExample4 {
    public static void main(String[] args) {
        // 람다식 사용해 문자열 길이 계산
        StringLengthFunctionalInterface strLength = (str) -> str.length();

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String input = sc.nextLine();

        System.out.println("문자열의 길이 : " + strLength.getLength(input));

        sc.close();
    }
}
