package org.example.day18.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {

        // 1. 랜덤한 정수 500개 (-200 ~ 200)
        Random r = new Random();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 500; i++){
            list.add(r.nextInt(401) - 200);
        }

        Map<Integer, List<Integer>> map = list.stream()
                .filter(n -> n >= 0 && n % 2 == 0) // 배열에서 0 이상의 짝수만을 필터링
                .collect(Collectors.groupingBy(n -> (int)Math.sqrt(n))); // 각 숫자의 제곱근 산출 및 제곱근 결과를 기준으로 숫자 그룹화 각 그룹 내 기존 숫자의 합 계산

        for (int key : map.keySet()){
            System.out.println(map.get(key));
        }

        // 5. 각 그룹의 합이 가장 큰 값 산출

        // 6. 이 값과 해당 그룹에 속한 숫자들을 출력
    }
}
