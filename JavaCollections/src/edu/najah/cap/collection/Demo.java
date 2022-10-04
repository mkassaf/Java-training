package edu.najah.cap.collection;

import java.util.*;

public class Demo {

    //Java Collections
    public static void main(String[] args) {
        LinkedList<String> myStringsLinkedList = new LinkedList<>();
        LinkedList<Integer> myIntegersLinkedList = new LinkedList<>();



        myIntegersLinkedList.add(1);
        myIntegersLinkedList.add(new Integer(1));
        myIntegersLinkedList.add(new Integer(1));
        myIntegersLinkedList.add(new Integer("2"));
        System.out.println(myIntegersLinkedList);

        myStringsLinkedList.add("Hello");
        myStringsLinkedList.add("Hello");
        myStringsLinkedList.add("Java");
        myStringsLinkedList.add("Training");
        myStringsLinkedList.add("Collections");

        System.out.println(myStringsLinkedList.size());
        System.out.println(myStringsLinkedList.get(0));
        System.out.println(myStringsLinkedList.contains("Java"));
        System.out.println(myStringsLinkedList.contains("Nothing"));//false
        System.out.println(myStringsLinkedList);

        for (int i=0; i< myStringsLinkedList.size(); i++){
            System.out.println(myStringsLinkedList.get(i));//
        }

        for (String element : myStringsLinkedList){
            System.out.println(element);//
        }

        myStringsLinkedList.forEach(element -> System.out.println(element));//
        myStringsLinkedList.remove(0);
        System.out.println(myStringsLinkedList);
        myStringsLinkedList.remove("Training");
        System.out.println(myStringsLinkedList);

        myStringsLinkedList.removeIf(str -> str.length() < 5);


        System.out.println(myStringsLinkedList);


        Set<String> data =  new HashSet<>();//unique

        data.add("Hello");//hello -> hash function -> key -> location
        data.add("Hello");
        data.add("Ahmad");
        data.add("Java");

        System.out.println("Set elements: " + data);

        TreeSet<String> treeSet =  new TreeSet<>();//unique + sorted

        treeSet.add("Hello");
        treeSet.add("Hello");
        treeSet.add("Ahmad");
        treeSet.add("Java");

        System.out.println("treeSet elements: " + treeSet);

        myStringsLinkedList.contains("Hello");//for
        data.contains("Hello");//hash


        Stack<Boolean> myStack = new Stack<>();
        Queue<String> myQueue = new LinkedList<>();

        //Queue<String> myPQueue = new PriorityQueue<>();

        myQueue.add("add");
        myStack.push(true);


        HashMap<String, Integer> myMap = new HashMap<>(); // key and value

        myMap.put("Ahmad", 90);
        myMap.put("Tala", 92);
        myMap.put("Rami", 72);

        Set<String> keys = myMap.keySet();

        for (String key: keys) {
            System.out.println("Key : " + key);
            System.out.println("Value: " + myMap.get(key));
        }

        if (myMap.containsKey("Rami")) {
            System.out.println("Value for Rami: " + myMap.get("Rami"));
        }
        if (myMap.containsKey("Zaid")){//false
            Integer value = myMap.get("Zaid");
            System.out.println("Value for Zaid: " + value.toString());
        }


    }


    public static void SetExample(){


    }
}
