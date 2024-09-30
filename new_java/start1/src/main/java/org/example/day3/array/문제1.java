package org.example.day3.array;

public class 문제1 {
    public static void main(String[] args) {
        /*
        1. 정수 배열을 만들어 11, 22, 33, 44, 55를 넣으세요.
        (처음부터 값을 알고 있는 경우)
        1-1. 첫번 째 값을 프린트
        1-2. 세번 째 값을 프린트
        1-3. 마지막 값을 프린트
        1-4. 전체 프린트
        2. 실수 배열을 만들어 11.1, 22.2, 33.3을 넣으세요.
        (처음부터 값을 알고 있는 경우)
        2-1. 첫번 째 값과 두번째 값을 더해서 프린트
        2-2. 첫번 째 값과 마지막 값을 더해서 프린트
        2-3. 배열에 들어있는 전체 개수를 프린트
        2-4. 전체 프린트
         */
        int[] nums = {11, 22, 33, 44, 55};
        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 1) {
                System.out.println(nums[i]);
            }
        }
        for(int num : nums) {
            System.out.println(num);
        }

        System.out.println("================================");

        double[] doubles = {11.1, 22.2, 33.3};
        System.out.println(doubles[0] + doubles[1]);
        System.out.println(doubles[0] + doubles[2]);
        System.out.println(doubles.length);
        for (double num : doubles) {
            System.out.println(num);
        }
        /*
        3. 개수가 4개인 문자(char) 배열을 만들어(처음에는 값을 모르고 있는 경우)
        3-1. 첫 번째 위치에 '남'을 넣어, 첫 번째 값 프린트
        3-2. 두 번째 위치에 '여'를 넣어, 두 번째 값 프린트
        3-3. 전체 개수와 전체 배열의 값을 프린트
        4. 개수가 3개인
            문자열(String) 배열을 만들어(처음에는 값을 모르고 있는 경우)
        4-1. 각 인덱스의 자리에 여행가고 싶은 곳을 제일 가고 싶은 곳부터 순서대로
              세 곳을 넣어서 저장(부산, 제주도, 전주인 경우)
        4-2. 전체 프린트
        4-3. 다음과 같이 프린트되도록 처리
              내가 첫 번째 가고 싶은 곳은 부산이고, 마지막 가고 싶은 곳은 전주이다.
         */

        char[] chars = new char[4];
        chars[0] = '남';
        System.out.println(chars[0]);
        chars[1] = '여';
        System.out.println(chars[1]);
        System.out.println(chars.length);
        for (char ch : chars) {
            System.out.println(ch);
        }

        System.out.println("===========================================");

        String[] locations = new String[3];
        locations[0] = "제주도";
        locations[1] = "부산";
        locations[2] = "전주";

        for (String location : locations) {
            System.out.println(location);
        }

        StringBuilder sb = new StringBuilder();

        sb.append("내가 첫 번째로 가고 싶은 곳은 ").append(locations[0]).append("이고").append("\n");
        sb.append("두 번째로 가고 싶은 곳은 ").append(locations[1]).append("이고").append("\n");
        sb.append("마지막으로 가고 싶은 곳은 ").append(locations[2]).append("이다.");

        System.out.println(sb.toString());
    }
}
