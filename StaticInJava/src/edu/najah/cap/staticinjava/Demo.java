package edu.najah.cap.staticinjava;

public class Demo {


    public static void main(String[] args) {

        //Code -> compile .class -> run (start up)

        StaticExample.imStatic = 10;
        System.out.println(StaticExample.imStatic);//10
        StaticExample.imStatic ++;

        System.out.println(StaticExample.imStatic);//11

        StaticExample obj = new StaticExample(1);
        StaticExample obj2 = new StaticExample(2);

        obj.imStatic = 20;
        System.out.println(obj.imStatic);// 20
        System.out.println(obj2.imStatic);// 20
        System.out.println(StaticExample.imStatic);//20
        System.out.println(obj.nonStatic);// 1
        System.out.println(obj2.nonStatic);// 2

        StaticExample.imStatic++;
        System.out.println(obj.imStatic);// 21
        System.out.println(obj2.imStatic);// 21
        System.out.println(StaticExample.imStatic);//21

        obj2.nonStatic++;
        System.out.println(obj.nonStatic);// 1
        System.out.println(obj2.nonStatic);// 3

        obj2.printAll();

        StaticExample.printStatic();//that means there is no object!
        obj2.printStatic();
    }
}
