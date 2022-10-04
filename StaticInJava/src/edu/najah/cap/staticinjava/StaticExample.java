package edu.najah.cap.staticinjava;

public class StaticExample {

    public int nonStatic;
    public static int imStatic;//This variable is shared for all objs created from this class


    public StaticExample(int value) {
        this.nonStatic = value;
    }

    /**
     * none static function can access to static and non-static variable
     */
    public void printAll(){
        System.out.println("I am in non static function called printAll");
        System.out.println(this.nonStatic);
        System.out.println(this.imStatic);
    }


    /**
     * This function shared and can be access via class
     * No need for object to call it
     */
    public static void printStatic(){
        System.out.println("I am a static function");
        //this -> object -> static can access object
        //System.out.println(this.nonStatic); compiler error, static can't access none-static
        System.out.println(imStatic);
    }

}
