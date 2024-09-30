package org.example.day4.array;

import java.util.Random;

public class 토익채점 {
    public static void main(String[] args) {
        int[] myAnswers = new int[990];
        int[] correctAnswers = new int[990];


        Random r = new Random(42);

        for (int i = 0; i < myAnswers.length; i++) {
            myAnswers[i] = r.nextInt(4) + 1;
            correctAnswers[i] = r.nextInt(4) + 1;
        }

        int score = 0;

        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i] == myAnswers[i]) {
                score++;
            }
        }

        System.out.println(score);
    }
}
