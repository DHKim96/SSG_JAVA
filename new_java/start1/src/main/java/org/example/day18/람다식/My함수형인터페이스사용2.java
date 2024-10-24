package org.example.day18.람다식;


// 2. 이름 없는 클래스(익명 클래스)로 바로 구현해서 사용하는 방법
public class My함수형인터페이스사용2 {
    public static void main(String[] args) {
        My함수형인터페이스 my = new My함수형인터페이스(){
            @Override
            public void myMethod() {
                System.out.println("2번 익명 클래스로 구현함");
            }
        };

        my.myMethod();
    }
}
