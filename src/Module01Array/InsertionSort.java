import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {

        // 1. First element is always sorted.
        // 2. Start from the second element.
        // 3. Select the key element.
        // 4. Compare with the elements to the left og the key.
        // 5. Arrange in ascending order.
        // 6. Increament the key and repeat the process.

        int key;

        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }

    }

    public static void main(String[] args) {

        int[] array = { 4, 2, 7, 1, 9 };

        // sorting the array
        insertionSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        //
    }

}
