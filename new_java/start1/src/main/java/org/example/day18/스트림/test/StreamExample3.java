package org.example.day18.스트림.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        // 각 숫자에 2를 곱한 후 출력
        List<Integer> numsMultipleTwo = nums.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());

        System.out.println(numsMultipleTwo);
    }
}
