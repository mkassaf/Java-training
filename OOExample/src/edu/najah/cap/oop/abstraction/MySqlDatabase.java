package edu.najah.cap.oop.abstraction;

import java.util.ArrayList;

public class MySqlDatabase implements Database {



    public void connect(String url) {

        System.out.println("MySqlDatabase: Connecting to " + url);
    }

    public ArrayList<Object> executeQuery(String query) {
        System.out.println("MySqlDatabase: Executing " + query);

        return null;
    }

    public void close() {
        System.out.println("MySqlDatabase: closing the connection ");
    }

}
