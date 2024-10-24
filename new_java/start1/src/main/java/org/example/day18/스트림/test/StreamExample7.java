package org.example.day18.스트림.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample7 {
    // 문자열 리스트에서 'a'를 포함하는 문자열만 필터링하여 출력

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "fig");

        List<String> aList = list.stream()
                .filter(word -> word.contains("a"))
                .collect(Collectors.toList());

        System.out.println(aList);
    }
}
