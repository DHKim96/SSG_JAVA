package org.example.day16.test.network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class 서버 {
    public static void main(String[] args) throws IOException {
        int port = 5000;
        ServerSocket server = new ServerSocket(port);
        //1.서버가 start
        int count = 0;
        while (true){
            System.out.println("서버가 돌아가는 중.");
            //2. 요청이 들어오면 승인용 서버가 승인을 함.
            //   --> 연결통로(stream)가 만들어진다.(Socket)
            Socket socket = server.accept();
            System.out.printf("%d번: 클라이언트가 %d포트 서버에 연결을 요청함. \n",  count++, port);
            //3. 보낼 데이터를 정하자.
            //   스트림으로 연결된 데이터를 보낼 수 있는 부품. PrintWriter
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.print("i am a java programmer.!!!");
            out.close();
            socket.close();
        }

    }
}
