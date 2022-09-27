package edu.najah.cap.oop.abstraction;

import java.util.ArrayList;

public class MySqlDB extends DatasbeAbst{


    public MySqlDB(String path) {
        super(path);
    }

    @Override
    protected void connect() {
        System.out.println("Connecting to this path " + this.getPath());
    }

    @Override
    protected ArrayList<Object> executeQuery(String query) {

        System.out.println("executeQuery : " + query);
        return null;
    }

    @Override
    public void close() {
        System.out.println("closing ");
    }
}
