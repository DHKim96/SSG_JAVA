package org.example.day8.class사용;

import java.io.*;

public class 스트림확인 {
    public static void main(String[] args) {
        String fileName = null;
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("파일명을 입력하세요(확장자 제외) : ");
        try {
            fileName = is.readLine();
            OutputStream os = new FileOutputStream("C:\\data\\");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
