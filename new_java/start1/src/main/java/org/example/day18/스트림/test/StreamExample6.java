package org.example.day18.스트림.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample6 {
    // 숫자 리스트에서 홀수의 제곱을 구해 출력하기
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> oddsPow = numbers.stream()
                .filter(n -> n % 2 == 1)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(oddsPow);
    }
}
