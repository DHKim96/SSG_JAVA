package org.example.day12.상속.문제.스레드;

public class 스레드1 extends Thread{
    public void run(){
        for (int i = 500; i > 0; i--){
            System.out.println(i);
        }
    }
}
