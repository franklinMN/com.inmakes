import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        System.out.println("Original HashSet: " + set);

        // Size of the HashSet
        int size = set.size();
        System.out.println("Size of HashSet: " + size);

        // Checking if an element is present
        boolean containsBanana = set.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);

        // Removing an element
        boolean removed = set.remove("Orange");
        System.out.println("Removed 'Orange': " + removed);
        System.out.println("HashSet after removal: " + set);

        // Iterating through the elements using for-each loop
        System.out.println("Iterating through elements:");
        for (String element : set) {
            System.out.println(element);
        }

        // Clearing the HashSet
        set.clear();
        System.out.println("HashSet after clear: " + set);

        // Checking if the HashSet is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);
    }
}
