package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

public class 부품사용2 {
    public static void main(String[] args) {
        //1. JFrame 만들고
        //2. 버튼 하나 만들어 얹기
        //3. 설정은 자유

        JFrame jFrame = new JFrame();

        JButton b1 = new JButton();

        jFrame.setSize(200, 200);

        b1.setBackground(Color.GRAY);
        b1.setSize(50,50);
        b1.setText("클릭 요망");

        FlowLayout flowLayout = new FlowLayout();
        jFrame.setLayout(flowLayout);

        jFrame.add(b1);

        jFrame.setVisible(true);
    }
}
