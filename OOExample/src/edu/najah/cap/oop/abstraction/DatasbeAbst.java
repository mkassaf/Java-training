package edu.najah.cap.oop.abstraction;

import java.util.ArrayList;

public  abstract class DatasbeAbst {

    public String getPath() {
        return path;
    }

    private String path;

    protected DatasbeAbst(String path) {
        this.path = path;
    }

    protected abstract void connect();
    protected abstract ArrayList<Object> executeQuery(String query);
    protected abstract void close();



    public final ArrayList<Object> getData(String query) {

        ArrayList<java.lang.Object> result = null;
        try {
            connect();
            result = executeQuery(query);
        } catch (Exception e){
            System.err.println("There is an error while connection to db " + e.getMessage());
        } finally {
            try {
                close();
            } catch (Exception e){
                System.err.println("Error while closing the connection" + e.getMessage());
            }
        }
        return result;

    }
}
