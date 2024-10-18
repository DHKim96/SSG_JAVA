package org.example.day14.크롤링;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class 크롤링테스트4 {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://news.naver.com/section/100").get();

            Elements eList = doc.select("span.Nitem_link_menu");

                System.out.println("총합 : " + eList.size() + "개");

            for (int i = 0; i < eList.size(); i++) {
                System.out.println(i + " : " + eList.get(i).text());
            }

        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
