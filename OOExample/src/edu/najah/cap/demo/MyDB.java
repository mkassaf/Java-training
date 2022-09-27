package edu.najah.cap.demo;

import edu.najah.cap.oop.abstraction.Database;
import edu.najah.cap.oop.abstraction.DatasbeAbst;

import java.util.ArrayList;

public class MyDB extends DatasbeAbst {
    protected MyDB(String path) {
        super(path);
    }

    @Override
    protected void connect() {

    }

    @Override
    protected ArrayList<Object> executeQuery(String query) {
        return null;
    }

    @Override
    protected void close() {

    }

}
