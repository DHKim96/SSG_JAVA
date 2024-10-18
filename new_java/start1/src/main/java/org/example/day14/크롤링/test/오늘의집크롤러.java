package org.example.day14.크롤링.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Arrays;

public class 오늘의집크롤러 {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://www.gorang.store/main.bo").get();

            Elements eList = doc.select("#commonContentInfoBox");

//            int[] views = new int[eList.size()];

            String[][] views = new String[eList.size()][2];

            for (int i = 0; i < views.length; i++) {
                Element element = eList.get(i);

                Elements el = element.select("#boardCount span");
                for (Element el1 : el) {
//                    views[i] = Integer.parseInt(el1.text());
                    views[i][0] = el1.text();

                }

                Elements el = element.select("#boardCount span");
                for (Element el1 : el) {
//                    views[i] = Integer.parseInt(el1.text());
                    views[i][0] = el1.text();

                }
            }

            Arrays.sort(views);
            System.out.println("최저 조회수 : " + views[0]);
            System.out.println("최고 조회수 : " + views[views.length - 1]);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
