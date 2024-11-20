package org.example.mongo.test;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBTemplate {

    private static MongoClient client;

    private static synchronized MongoClient getClient(String host, int port) {
        if (client == null) {
            client = new MongoClient(host, port);
        }
        return client;
    }

    public static MongoCollection<Document> connect(String host, int port, String database, String collection) {
        MongoClient client = getClient(host, port);
        MongoDatabase db = client.getDatabase(database);
        return db.getCollection(collection);
    }

    public static void closeClient() {
        if (client != null) {
            client.close();
            client = null;
        }
    }
}
