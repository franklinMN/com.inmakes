package Module03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapbyKeys {

    public static HashMap<Integer, String> sortHashMapbyOrder(HashMap<Integer, String> hashMap,
            boolean orderBy) {

        // 1. Create a array of Entries for Map
        // 2. Create a Comparator to do the type of sort. naturalSort - true;
        // reverseSort - false
        // 3. sort the arraylist with comparator
        // 4. loop through the arraylist and put the entries in linkedHashMap
        // 5. return

        List<Map.Entry<Integer, String>> entries = new ArrayList<>(hashMap.entrySet());

        Comparator<Map.Entry<Integer, String>> comparator = orderBy
                ? Comparator.comparing(Map.Entry::getKey, Comparator.naturalOrder())
                : Comparator.comparing(Map.Entry::getKey, Comparator.reverseOrder());

        entries.sort(comparator);

        HashMap<Integer, String> newList = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> entry : entries) {
            newList.put(entry.getKey(), entry.getValue());
        }
        return newList;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1002, "Apple");
        hashmap.put(1001, "Orange");
        hashmap.put(1004, "Banana");
        hashmap.put(1003, "Grape");

        System.out.println("Original hashmap - ");
        System.out.println(hashmap);

        HashMap<Integer, String> sortedHashMap = sortHashMapbyOrder(hashmap, true);
        System.out.println("Sorted (Natural) hashmap - ");
        for (HashMap.Entry<Integer, String> entry : sortedHashMap.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + ", Value : "
                    + entry.getValue());
        }

        sortedHashMap = sortHashMapbyOrder(hashmap, false);
        System.out.println("Sorted (Reverse) hashmap - ");
        for (HashMap.Entry<Integer, String> entry : sortedHashMap.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + ", Value : "
                    + entry.getValue());
        }
    }

}