package edu.najah.cap.oo2023.collections;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        Item item3 = new Item("item3");

        Item[] items = {item1, item2, item3};
        Item[] items2 = new Item[3];

        items2[0] = item1;
        items2[1] = item2;
        items2[2] = item3;

        items[2].print();
        items[0].print();


        ArrayList<Item> items3 = new ArrayList<>();

        items3.add(new Item("item4"));
        items3.add(new Item("item5"));
        items3.add(new Item("item6"));

        items3.get(0).print();
        for (Item item : items3) {
            item.print();
        }

        Set<Item> items4 = new HashSet<>();
        TreeSet<Item> items5 = new TreeSet<>();

        Dictionary<String, String> dictionary = new Hashtable<>();
        Map<String , String> map = new HashMap<>();

        dictionary.put("key1", "value1");
        dictionary.put("key2", "value2");
        dictionary.put("key3", "value3");

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        Set<String> keys = map.keySet();// key1, key2, key3
        Enumeration<String> keys2 = dictionary.keys();// key1, key2, key3

        for (String key : keys) {
            System.out.println(map.get(key));
            System.out.println(map.containsKey(key));
        }

        System.out.println(map.containsKey("key1"));// true

        System.out.println(map.containsKey("key10"));// false

        map.put("key1", "value11111");

        System.out.println(map.get("key1"));// value11111
    }
}
