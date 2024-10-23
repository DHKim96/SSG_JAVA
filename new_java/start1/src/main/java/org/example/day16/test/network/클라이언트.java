package org.example.day16.test.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class 클라이언트 {
    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 1000; i++){
            Socket client = new Socket("localhost", 5000);
            System.out.println(i + ">> 클라이언트가 접속함.");
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.printf("서버로 부터 받은 데이터 >> %s ", br.readLine());
        }

    }
}
