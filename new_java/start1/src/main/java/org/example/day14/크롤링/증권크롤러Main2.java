package org.example.day14.크롤링;

import javax.swing.*;

public class 증권크롤러Main2 {
    public static void main(String[] args) {
        String code = JOptionPane.showInputDialog("code 입력");

        증권크롤러2 naver = new 증권크롤러2();

        try {
            String[] data = naver.crawl(code);

            System.out.printf("code %s인 회사의\n", code);
            System.out.printf("최고가는 %s원 이고\n", data[0]);
            System.out.printf("최저가는 %s원 이다\n", data[1]);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // code 035720 인 회사의
        // 최고가는 37,000 이고
        // 최저가는 35,000 이다.


    }
}
