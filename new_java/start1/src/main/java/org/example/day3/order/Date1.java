package org.example.day3.order;

import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        //입력할 때 자동으로 년월일, 시분초로 구해주고 싶다.
        Date date = new Date();

        int year = date.getYear() + 1900;
        int month = date.getMonth() + 1;
        int date1 = date.getDate();
        int day = date.getDay();
        int hour = date.getHours();
        int minute = date.getMinutes();
        int second = date.getSeconds();

        System.out.println(year + " " + month + " " + date1 + " " + day + " " + hour + " " + minute + " " + second);

        // 오늘은 무슨 요일인가요?
        char ch = 'a';
        switch (day){
            case 1:
                ch = '월';
                break;
            case 2:
                ch = '화';
                break;
            case 3:
                ch = '수';
                break;
            case 4:
                ch = '목';
                break;
            case 5:
                ch = '금';
                break;
            case 6:
                ch = '토';
                break;
            default :
                ch = '일';
        }

        System.out.println("오늘은 " + ch + "요일입니다.");
    }
}
