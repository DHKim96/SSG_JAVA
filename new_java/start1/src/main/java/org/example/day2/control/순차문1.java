package org.example.day2.control;

import javax.swing.*;

public class 순차문1 {
    public static void main(String[] args) {
        String id = "root";
        String pw = "1234";

        // 입력하는 처리 필요
        String id2 = null;
        String pw2 = null;
        id2 = JOptionPane.showInputDialog("id입력");
        pw2 = JOptionPane.showInputDialog("pw입력");

        System.out.println(id.equals(id2) && pw.equals(pw2));
    }
}
