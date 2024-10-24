package org.example.day18.람다식.test;

public class LambdaExample5 {
    public static void main(String[] args) {
        // 두 수의 차를 계산하는 람다식
        DifferenceFunctionalInterface diff = (x, y) -> x - y;

        System.out.println(diff.subtract(30, 100));
    }
}
