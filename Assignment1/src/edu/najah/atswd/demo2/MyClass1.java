package edu.najah.atswd.demo2;

public class MyClass1 {

    @Deprecated
    public void print(){

    }

    public void printV2(){

    }

    @Override
    public String toString(){
        return "I am MyClass 1 in demo 2";
    }

    @Override
    protected void finalize() throws Throwable {

       //logic


        super.finalize();

        //code
    }
}
