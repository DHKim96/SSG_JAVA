package org.example.day6.array3;

import javax.swing.*;

public class 그래픽1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("그래픽 연습");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //3
        //x를 누르면 프로그램 종료시킴 설정.!

        JButton button = new JButton();
        button.setText("나를 눌러!");//함수, 메서드, 명령어는 명령어어(입력 데이터);

        JButton button2 = new JButton();
        button2.setText("@@@@@@@@@@@@");

        frame.add(button);
        frame.add(button2);

        //맨 끝!
        frame.setVisible(true);
    }
}