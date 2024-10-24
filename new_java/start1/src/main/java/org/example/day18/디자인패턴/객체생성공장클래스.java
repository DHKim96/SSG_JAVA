package org.example.day18.디자인패턴;

public class 객체생성공장클래스 {
    public Object getInstance(String name){
        if (name.equalsIgnoreCase("apple")){ // 대소문자를 떠나 동일 여부
            return new 애플클래스();
        } else if (name.equalsIgnoreCase("banana")){
            return new 바나나클래스();
        } else return null;
    }
}
