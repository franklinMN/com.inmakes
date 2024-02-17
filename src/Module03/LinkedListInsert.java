package Module03;

// 1. Write a Java Program To Insert An Element at The Specified Position At The LinkedList

import java.util.LinkedList;
import java.util.List;

public class LinkedListInsert {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Grapes");


        // insert element at specified location
        fruits.add(0, "Mongo");
        fruits.add(fruits.size()-1, "Sugarcane");

        int location = 3;
        fruits.add(location, "Gauva");

        System.out.println(fruits);

    }
}
