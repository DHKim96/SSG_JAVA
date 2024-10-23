package org.example.day15.test;

public class Cast4 {

    static String[] stack;
    static int idx = 0;

    public static void main(String[] args) {
        stack = new String[4];
    }

    public void push(String name){
        stack[idx++] = name;
    }

    public String pop(){
        return stack[--idx];// push로 인한 인덱스 증가 고려
    }

    public int size(){
        return idx;
    }

    public boolean isEmpty(){
        return idx == 0;
    }

}
