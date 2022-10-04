package edu.najah.cap.oop.abstraction;

import java.util.ArrayList;

public class PostgresDatabase implements Database {

    public void connect(String url) {

        System.out.println("PostgresDatabase: Connecting to " + url);
    }

    public ArrayList<Object> executeQuery(String query) {
        System.out.println("PostgresDatabase: Executing " + query);

        return null;
    }

    public void close() {
        System.out.println("PostgresDatabase: closing the connection ");
    }
}
