package org.example.day12.상속.문제.볼펜;

public class 볼펜Main {
    public static void main(String[] args) {
        학용품 pen = new 볼펜();
        pen.buy();

        ((볼펜)pen).write();


    }
}
