package org.example.day17.네트워크;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {
    public static void main(String[] args) throws IOException {
        //보내는 전화기역할 부품 --> DatagramSocket
        DatagramSocket socket = new DatagramSocket();
        //주소: ip(InetAddress) + port(int)
        String host = "192.168.60.21";
        InetAddress ip = InetAddress.getByName(host);
        //램에 어느 주소에 부품이 있는 줄을 알면, 그거 쓰면 됨.!
        //없으면, new생성해서 넣어줌.
        //DatagramSocket ds = new DatagramSocket();

        //데이터: String --> byte[]
        String s = "안녕하세요";
        byte[] data = s.getBytes();
        //패킷 --> DatagramPacket(데이터, 주소)
        DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);

        //소켓으로 패킷을 보내자.
        socket.send(packet);


        System.out.println("패킷을 보냄.");
        //소켓 자원해제.
        socket.close();
    }





}
