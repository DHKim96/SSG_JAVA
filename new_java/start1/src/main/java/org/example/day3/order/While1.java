package org.example.day3.order;

import java.util.Date;

public class While1 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }

        System.out.println("----------------");

        while (true){
            System.out.println("내가 계속 돌아.");
            Date date = new Date();
            int seconds = date.getSeconds();
            if(seconds > 50){
                break;
            }
        }
    }
}
