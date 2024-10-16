package org.example.day12.상속.문제.스레드;

public class 스레드사용 {

    public static void main(String[] args) {
        Thread t1 = new 스레드1();
        Thread t2 = new 스레드2();
        Thread t3 = new 스레드3();

        ((스레드1)t1).start();
        ((스레드2)t2).start();
        ((스레드3)t3).start();
    }

}
