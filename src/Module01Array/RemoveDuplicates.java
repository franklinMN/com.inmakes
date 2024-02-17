//5. Write A Java Program to Remove Duplicate Elements in an Array.

import java.util.Arrays;

class RemoveDuplicates {

    public static int[] removeDuplicatesFromArray(int[] array) {

        Arrays.sort(array);

        int uniqueCount = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1])
                array[uniqueCount++] = array[i];
        }

        return Arrays.copyOf(array, uniqueCount);
    }

    public static void main(String[] args) {

        int[] array = { -1, 999, 0, -999, -9999, 9999, -999, -9999, 9999, -1, 999, 0 };
        System.out.println("Original array : " + Arrays.toString(array));

        int[] uniqueArray = removeDuplicatesFromArray(array);
        System.out.println("Unique array : " + Arrays.toString(uniqueArray));
    }
}