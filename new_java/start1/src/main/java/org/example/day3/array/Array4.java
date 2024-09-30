package org.example.day3.array;

public class Array4 {
    public static void main(String[] args) {
        /*
        1. 정수 배열을 만들어 11, 22, 33, 44, 55를 넣으세요.
        (처음부터 값을 알고 있는 경우)
        1-1. 첫번 째 값을 프린트
        1-2. 세번 째 값을 프린트
        1-3. 마지막 값을 프린트
        1-4. 전체 프린트
         */
        int[] nums = {11, 22, 33, 44, 55};
        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                System.out.println(nums[i]);
            }
        }
        for(int num : nums) {
            System.out.println(num);
        }
    }
}
