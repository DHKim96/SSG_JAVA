package org.example.day12.상속.문제.스레드;

public class 스레드3 extends Thread {
    public void run(){
        String[] foods = {"a", "b", "c", "d", "e", "f"};
        for(int i = 0; i < 500; i++){
            System.out.println(foods[i % 6]);
        }
    }
}
