package edu.najah.cap.oop.abstraction;



import java.lang.reflect.Array;
import java.util.ArrayList;

public interface Database {
    //Behaviour
    public void connect(String query);

    public ArrayList<Object> executeQuery(String query);

    public void close();


}
