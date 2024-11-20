package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Member하나수정 {
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
        // insert 할 json(document) 생성
        Document filter = new Document();
        filter.append("id", "kim"); // {id : "apple"}

        Bson pw = Updates.set("pw", "pass"); // {$set : {pw : "pass"}}


        //4. 전송, 결과처리
        member.updateOne(filter, pw);
        // db.member.updateMany({id : "kim"}, "{$set : {pw : "pass"}}");
        client.close();
    }
}