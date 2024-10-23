package org.example.day15.test;

import java.util.HashMap;
import java.util.Map;

public class Cast2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(100, "김데이");
        map.put(200, "김사전");
        map.put(300, "김구조");
        map.put(400, "김자료");

        map.remove(200); // 탈퇴
        map.replace(300, "김충성");

        for (int key : map.keySet()) {
            System.out.println("고객 번호 : " + key + ", 이름 : " + map.get(key));
        }

    }
}
