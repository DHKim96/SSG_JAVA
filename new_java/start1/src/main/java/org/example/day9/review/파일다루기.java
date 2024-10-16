package org.example.day9.review;

import java.io.*;

public class 파일다루기 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\SSG_JAVA\\new_java\\start1\\build.gradle"));
            char[] data = new char[256];

            String str = null;

            while((str = br.readLine()) != null) {
                System.out.println(str);
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
