package org.example.day18.람다식.test;

public class LambdaExample3 {
    public static void main(String[] args) {
        // 람다식 사용해서 문자열을 대문자로 변환
        StringFunctionalInterface sfi = (input) -> input.toUpperCase();

        System.out.println(sfi.convert("today's lunch"));
    }
}
