package org.example.mongo;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.example.mongo.test.MongoDBTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test2 {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.SEVERE);

        MongoCollection<Document> products = MongoDBTemplate.connect("localhost", 27017, "shop2", "product");

//        1번
//        Document query = new Document("category", "Electronics")
//                .append("price", new Document("$gte", 1000000));
//        for (Document product : products.find(query)) {
//            System.out.println(product.toJson());
//        }

//         2번 category Clothing에 brand Asus 지우기
//        Document query = new Document("category", "Clothing").append("brand", "Asus");
//        products.deleteMany(query);

//         3번  category books에 price 1900000이상 지우기
//        Document query = new Document("category", "Books")
//                .append("price", new Document("$gte", 1900000));
//        for (Document product : products.find(query)) {
//            System.out.println(product.toJson());
//        }
//        products.deleteMany(query);

//         4번
//        Document query = new Document("category", "Electronics")
//                .append("name", new Document("$regex", "Smart"));
//        for (Document product : products.find(query)) {
//            System.out.println(product.toJson());
//        }

//         5번
        Document query = new Document("category", "Clothing")
                .append("price", new Document("$gte", 30000));
        products.deleteMany(query);

        MongoDBTemplate.closeClient();
    }
}
