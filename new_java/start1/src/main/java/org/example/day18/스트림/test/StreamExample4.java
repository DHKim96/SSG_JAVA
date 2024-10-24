package org.example.day18.스트림.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample4 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-3, 5, -1, 7, -8, 2);

        // 리스트에서 음수만 필터링해 출력하기
        List<Integer> negatives = nums.stream()
                                        .filter(num -> num < 0)
                                        .collect(Collectors.toList());

        System.out.println(negatives);
    }
}
