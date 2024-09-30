package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

public class 부품사용1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b1 = new JButton();
        JButton b2 = new JButton();

        f.setSize(300, 300);

        b1.setText("나를 클릭하세요.");
        b2.setText("나도 클릭해줘요.");

        b1.setBackground(Color.RED);
        b2.setBackground(Color.GREEN);

        b1.setForeground(Color.BLUE);
        b2.setForeground(Color.YELLOW);


        Font font = new Font("궁서", Font.BOLD, 20);
        b1.setFont(font);
        b2.setFont(font);

        // 배치해주는 부품
        // 물 흐르듯 순서대로 다 붙여주는 레이아웃
        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        f.add(b1);
        f.add(b2);

        // JFrame 은 디폴트가 안보이는 것이기에 보이도록 별도 설정 필요(맨 끝에 작성해야 함 이후의 것들은 안보이기에)
        f.setVisible(true);
    }
}
