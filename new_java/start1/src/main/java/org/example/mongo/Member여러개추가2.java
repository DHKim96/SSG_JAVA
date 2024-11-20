package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Member여러개추가2 {
    public static void main(String[] args) {

        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.SEVERE);

        //1. MongoClient생성
        MongoClient client = new MongoClient("localhost", 27017);

        //2. db연결, collection연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("member");
        System.out.println("member컬렉션까지 연결 성공~!");

        //3. 전송할 js생성

        List<Document> list = new ArrayList<>();

        for (int i = 5; i < 105; i++){
            Document doc = new Document();
            doc.append("id", "apple" + i); // {id : "apple"}
            doc.append("pw", "1234"); // {id : "apple", pw : "1234"}
            doc.append("name", "apple" + i); //{id : "apple", pw : "1234", name : "apple"}
            doc.append("tel", "011"); //{id : "apple", pw : "1234", name : "apple", tel : "011"}

            list.add(doc);
        }

        //4. 전송, 결과처리
        member.insertMany(list);
        client.close();
    }
}