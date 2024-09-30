package org.example.day2.review;

public class Test1 {
    public static void main(String[] args) {
        //기본형 변수를 정리 - 정수, 실수, 문자1, 논리
        float temp = 23.5f; // => double 도 가능
        byte date = 26; // byte : -128 ~ 127 ==> int 도 가능
        final char DAY = '목'; // final 선언 시 변수명 대문자
        boolean food = true;
        food = false;

        String roomNo = "강의장 6호";

        // 변수들을 콘솔로 출력
        System.out.println("현재 온도: " + temp);
        System.out.println("날짜: " + date);
        System.out.println("요일: " + DAY);
        System.out.println("음식 유무: " + food);
        System.out.println("방 번호: " + roomNo);
    }
}
