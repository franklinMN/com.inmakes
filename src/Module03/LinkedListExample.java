// 1. Write a Java Program To Insert An Element at The Specified Position At The LinkedList

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pineappale");
        fruits.add("Grapes");

        fruits.sort(Comparator.reverseOrder());

        System.out.println("Fruits - " + fruits.toString());

        // insert element at specified location
        fruits.add(0, "Mongo");
        fruits.add(fruits.size()-1, "Sugarcane");

        // System.out.println("fruits.elements() - " + fruits.el);

        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Before Removal - " + fruits);
        
        fruits.remove(fruits.size()-1);
        fruits.remove(fruits.size()-1);
        fruits.remove(fruits.size()-1);

        System.out.println("Before sort - " + fruits);

        fruits.sort(Comparator.naturalOrder());

        System.out.println("After sort - " + fruits);


    }
}
