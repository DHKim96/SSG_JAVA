package org.example.day12.상속.문제.스레드;

import java.util.Date;

public class 스레드2 extends Thread{
    public void run(){
        for (int i = 0; i < 500; i++){
            System.out.println(new Date());
        }
    }
}
