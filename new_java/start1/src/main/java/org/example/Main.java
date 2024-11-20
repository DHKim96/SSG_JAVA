package org.example;

import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<Integer, Character> map = Map.of(1000, 'I', 5 , 'V');

        for (int num : map.keySet()){
            System.out.println(map.get(num));
        }
    }
}