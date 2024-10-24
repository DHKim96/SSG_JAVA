package org.example.day18.람다식.test;

public class LambdaExample2 {
    public static void main(String[] args) {
        SumFunctionalInterface sumfi = (a, b) -> a + b;

        System.out.println("덧셈 결과 : " + sumfi.sum(5, 10));
    }
}
