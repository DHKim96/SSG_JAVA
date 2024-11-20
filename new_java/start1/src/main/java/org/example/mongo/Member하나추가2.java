package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Member하나추가2 {
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
        Scanner sc = new Scanner(System.in);

        System.out.print("id(영문) : ");
        String id = sc.nextLine();

        System.out.print("pw : ");
        String pw = sc.nextLine();

        System.out.print("name : ");
        String name = sc.nextLine();

        System.out.print("tel(xxx-xxxx-xxxx) : ");
        String tel = sc.nextLine();


        Document doc = new Document();
        doc.append("id", id); // {id : "apple"}
        doc.append("pw", pw); // {id : "apple", pw : "1234"}
        doc.append("name", name); //{id : "apple", pw : "1234", name : "apple"}
        doc.append("tel", tel); //{id : "apple", pw : "1234", name : "apple", tel : "011"}

        //4. 전송, 결과처리
        member.insertOne(doc);
        client.close();
    }
}