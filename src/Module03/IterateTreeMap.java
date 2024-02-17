package Module03;

// 5. Write A Program To Iterate TreeMap in java

import java.util.Map;
import java.util.TreeMap;

public class IterateTreeMap {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1001, "Apple");
        treeMap.put(1003, "Orange");
        treeMap.put(1002, "Banana");
        treeMap.put(1005, "Grape");
        treeMap.put(1004, "Pineapple");

        // iterator with keys
        System.out.println("Iterating with keys");
        for (Integer key : treeMap.keySet()) {
            System.out.println("KEY - " + key + " : VALUE - " + treeMap.get(key));
        }

        // iterator with entries
        System.out.println("Iterating with Entries");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("KEY - " + entry.getKey() + " : VALUE - " + entry.getValue());
        }

        // iterating with foreach
        System.out.println("Iterating with foreach Lambda");
        treeMap.forEach((key, value) -> System.out.println("KEY - " + key + " : VALUE - " + value));
    }
}
