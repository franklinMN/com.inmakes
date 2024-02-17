import java.util.Vector;
import java.util.Enumeration;
import java.util.AbstractCollection;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Displaying the Vector using various methods

        // Method 1: Using Enumeration
        System.out.println("Using Enumeration:");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        // Method 2: Using enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Method 3: Using get method with index
        System.out.println("\nUsing get method with index:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        // Method 4: Using forEach method (introduced in Java 8)
        System.out.println("\nUsing forEach method:");
        vector.forEach(System.out::println);

        // Removing an element
        vector.remove("Banana");

        // Checking if the Vector contains a specific element
        boolean containsOrange = vector.contains("Orange");
        System.out.println("\nDoes the Vector contain Orange? " + containsOrange);

        // Size of the Vector
        int size = vector.size();
        System.out.println("Size of the Vector: " + size);

        // Clearing the Vector
        vector.clear();

        // Checking if the Vector is empty
        boolean isEmpty = vector.isEmpty();
        System.out.println("Is the Vector empty? " + isEmpty);
    }
}
