package org.example.day18.스트림.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "sun", "sky", "sea");

        // 길이가 3 이상인 문자열 필터링하여 출력
        List<String> more3Words = words.stream()
                            .filter(word -> word.length() >= 3)
                            .collect(Collectors.toList());

        System.out.println(more3Words);
    }
}
