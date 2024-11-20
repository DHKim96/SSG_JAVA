package org.example.mongo;

public class NaverInsertMain {
    public static void main(String[] args) {
        MongoDBCafeInsert.insertCafeMember();
        MongoDBBlogInsert.insertBlogMember();
        MongoDBLineInsert.insertLineMember();
    }
}
