import java.util.Arrays;

public class MergeArray {

    public static int[] mergeArray( int[] arr1, int[] arr2){

        int len1 = arr1.length;
        int len2 = arr2.length;

        int[] temp = new int[len1+len2];

        System.arraycopy(arr1, 0, temp, 0, len1);
        System.arraycopy(arr2, 0, temp, len1, len2);

        return temp;

    }
    public static void main(String[] args) {
        int[] array1 = {1, 12, 30, 24};
        int[] array2 = {5, 61, 7, 8, 9};

        int[] mergedArray = mergeArray(array1, array2);

        System.out.println("Array 1 : " + Arrays.toString(array1));
        System.out.println("Array 2 : " + Arrays.toString(array2));
        System.out.println("Merged Array : " + Arrays.toString(mergedArray));

        
    }
    
}
