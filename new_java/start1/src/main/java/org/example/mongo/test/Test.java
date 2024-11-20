package org.example.mongo.test;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {

        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.SEVERE);

        // 1. Client 연결
        MongoClient client = new MongoClient("localhost", 27017);

        // 2. DB, COLLECTION 연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> memo = db.getCollection("memo");

        // 3. 요청 전송
        Document filter = new Document();
        filter.append("office", "busan");

        FindIterable<Document> result = memo.find(filter);

        for (Document doc : result) {
            System.out.println(doc.get("name"));
            System.out.println(doc.get("age"));
            System.out.println(doc.get("office"));
            System.out.println(doc.get("phone"));
            System.out.println("-----------------------------------------");
        }


        // 4. 스트림 닫기
        client.close();
    }
}
