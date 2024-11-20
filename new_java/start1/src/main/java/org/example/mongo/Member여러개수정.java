package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Member여러개수정 {
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
        //update 할 json(document) 생성
        Document filter = new Document();
        filter.append("id", "kim"); // {id : "apple"}

        // 수정할 내용 지정
        Bson pw = Updates.set("pw", "password");
        Bson name = Updates.set("name", "Timothy");

        List<Bson> list = new ArrayList<>();

        list.add(pw);
        list.add(name);

        Bson all = Updates.combine(list);

        //4. 전송, 결과처리
        member.updateMany(filter, all);
        // db.member.updateMany({id : "kim"}, "{$set : {pw : "password", name : "Timothy"}}");
        client.close();
    }
}