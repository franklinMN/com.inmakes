import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Mango");
        treeSet.add("Banana"); // Duplicate, will be ignored

        System.out.println("Original TreeSet: " + treeSet);

        // Removing an element
        treeSet.remove("Orange");
        System.out.println("TreeSet after removing 'Orange': " + treeSet);

        // Checking if an element is present
        boolean containsBanana = treeSet.contains("Banana");
        System.out.println("Does the TreeSet contain 'Banana'? " + containsBanana);

        // Getting the first and last elements
        String firstElement = treeSet.first();
        String lastElement = treeSet.last();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Getting elements less than or equal to a given element
        TreeSet<String> lessThanOrEqualSet = (TreeSet<String>) treeSet.headSet("Mango", true);
        System.out.println("Elements less than or equal to 'Mango': " + lessThanOrEqualSet);

        // Getting elements greater than or equal to a given element
        TreeSet<String> greaterThanOrEqualSet = (TreeSet<String>) treeSet.tailSet("Mango", true);
        System.out.println("Elements greater than or equal to 'Mango': " + greaterThanOrEqualSet);

        // Iterating through the elements
        System.out.println("Iterating through the TreeSet:");
        for (String element : treeSet) {
            System.out.println(element);
        }

        // Clearing the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);
    }
}
