package org.example.day18.스트림.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample5 {
    // 리스트에서 각 문자열의 두문자만 추출하여 출력
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        List<Character> heads = words.stream()
                .map(word -> word.charAt(0))
                .collect(Collectors.toList());

        System.out.println(heads);
    }
}
