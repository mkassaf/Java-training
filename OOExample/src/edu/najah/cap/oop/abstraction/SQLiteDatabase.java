package edu.najah.cap.oop.abstraction;

import java.util.ArrayList;

public class SQLiteDatabase implements Database {


    public void connect(String url) {

        System.out.println("SQLiteDatabase: Connecting to " + url);
    }

    public ArrayList<Object> executeQuery(String query) {
        System.out.println("SQLiteDatabase: Executing " + query);

        return null;
    }

    public void close() {
        System.out.println("SQLiteDatabase: closing the connection ");
    }
}

