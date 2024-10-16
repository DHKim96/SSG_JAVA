package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 영화예매시스템 {
    static int count = 0;
    final static int PRICE = 10000;
    static boolean[] reservation;

    public static void main(String[] args) {
        int seats = 100;
        reservation = new boolean[seats];

        JFrame frame = new JFrame();
        frame.setSize(560, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        frame.setLayout(flow);//add()한 순서래도 물흐르듯이 뒤에다 붙여줌.!

        StringBuilder sb  = new StringBuilder();

        for (int i = 0; i < seats; i++) {
            JButton button = new JButton();
            button.setText(i + "");
            frame.add(button);

            int num = i;

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    sb.append(" ");
                    //버튼클릭했을 때 실행되는 내용!
                    //버튼클릭하면 ActionListener안에 있는 actionPerformed()라는
                    //함수가 자동 실행!
                    count++;
                    String s = e.getActionCommand();//버튼 위에 있는 글자를 가지고 온다.
                    System.out.println(s);
                    JOptionPane.showMessageDialog(frame, s+"번 예매됨.");
                    sb.append(s);
                    reservation[Integer.parseInt(s)] = true;
                    button.setEnabled(false);
                    button.setBackground(Color.red);

                    reservation[num] = true;
                }
            });
        }

        JButton payBtn = new JButton();
        payBtn.setText("결제하기");
        frame.add(payBtn);
        payBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "최종 결제 금액은 " + (PRICE * count) + "원 입니다.");
                JOptionPane.showMessageDialog(frame, "예매한 좌석은 " + sb.toString() + "번 입니다" );
            }
        });

        //맨 끝!
        frame.setVisible(true);
    }
}