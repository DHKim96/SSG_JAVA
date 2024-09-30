package org.example.day2.review;

public class Test2 {
    public static void main(String[] args) {
        int x = 333;
        int y = 222;
        int sum = x + y;
        int minus = x - y;
        int multiply = x * y;
        int divide = x / y;
        int mod = x % y;
        System.out.println("sum = " + sum); // 결합 연산자
        // 결합 연산자 : 피연산자가 하나라도 String일 때
        /*
            산술 연산자는 정수 + 정수 계산 결과는 정수
            하나라도 실수이면 실수
         */

        // 비교연산자, 논리연산자의 결과는 무조건 논리형데이터(true/false)

        System.out.println(x == y);
        System.out.println(x >= y);

        //

    }
}
