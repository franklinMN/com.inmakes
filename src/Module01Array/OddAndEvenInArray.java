//7. Write A Java program To Print Odd and Even Numbers in An Array.

import java.util.Arrays;

public class OddAndEvenInArray {

    public static void oddEvenInSameArray(int[] array) {

        int evenPtr = 0;
        int oddPtr = array.length - 1;

        while (evenPtr < oddPtr) {

            // loop through till you find odd value
            while (array[evenPtr] % 2 == 0 && evenPtr < oddPtr)
                evenPtr++;

            // loop through till you find even value
            while (array[oddPtr] % 2 != 0 && evenPtr < oddPtr)
                oddPtr--;

            if (evenPtr < oddPtr) {
                int temp = array[evenPtr];
                array[evenPtr] = array[oddPtr];
                array[oddPtr] = temp;
            }

        }
        System.out.println("Array : " + Arrays.toString(array));
        System.out.println("Even Array : " + Arrays.toString(Arrays.copyOfRange(array, 0, evenPtr)));
        System.out.println("Odd Array  : " + Arrays.toString(Arrays.copyOfRange(array, oddPtr, array.length)));
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, -1, -2, -3, 0 };

        oddEvenInSameArray(array);
    }
}
