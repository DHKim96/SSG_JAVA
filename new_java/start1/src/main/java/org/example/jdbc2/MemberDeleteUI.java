package org.example.jdbc2;

import java.util.Scanner;

public class MemberDeleteUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("삭제할 id입력>> ");
        String id값 = sc.next(); //apple

        sc.close();

        MemberDAO memberDao = new MemberDAO();
        memberDao.delete(id값);
    }
}