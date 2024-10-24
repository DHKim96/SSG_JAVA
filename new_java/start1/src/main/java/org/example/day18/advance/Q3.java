package org.example.day18.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        // 1. 100개의 랜덤 정수(-100 ~ 100)
        Random r = new Random();

        List<Integer> randomList = new ArrayList<Integer>();

        for(int i = 0; i < 100; i++){
            randomList.add(r.nextInt(201) - 100);
        }

        // 2. 양수만 필터링

        // 3. 각 수의 제곱값 계산

        // 4. 제곱값이 1000 초과하는 수 추출

        // 5. 추출된 수의 평균값 계산

        randomList.stream()
                .filter(x -> x > 0)       // 양수만 필터링
                .map(x -> x * x)          // 제곱 계산
                .filter(x -> x > 1000)    // 1000 초과 필터링
                .mapToInt(x -> x)         // IntStream 변환
                .average()                // 평균 계산
                .ifPresentOrElse(
                        avg -> System.out.println((int)avg),
                        () -> System.out.println("조건을 만족하는 값이 없습니다.")
                );  // 결과 출력
    }
}
