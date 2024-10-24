package org.example.day18.스트림.test;

import java.util.Arrays;
import java.util.List;

public class StreamExample8 {
    // 문자열 리스트에서 각 문자열의 길이를 출력
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "lambda", "stream", "example");

        list.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
