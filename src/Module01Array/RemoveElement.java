//8. How To Remove Given Element from An Array in Java ?

import java.util.Arrays;

public class RemoveElement {

    public static int[] removeElementFromArray(int[] array, int target){

        int deleteIndex= -1;

        for(int i=0 ; i<array.length-1 ; i++){
            if( array[i] == target ){
                deleteIndex = i;
                break;
            }
        }

        if( deleteIndex == -1 )
            return array;

        int[] newArray = new int[array.length-1];

        // newArray = Arrays.copyOfRange(array, 0, deleteIndex);
        // newArray = Arrays.copyOfRange(array, deleteIndex+1, array.length);

        System.arraycopy(array, 0, newArray, 0, deleteIndex);
        System.arraycopy(array, deleteIndex+1, newArray, deleteIndex, array.length-deleteIndex-1);

        return newArray;
    }
    public static void main(String[] args) {
        int[] array = {4, 2, 6, 3, 2, 4, 5, 6, 1};
        int target = 6;

        System.out.println("Original Array - " + Arrays.toString(array));

        int[] newArray = removeElementFromArray(array, target);

        System.out.println("After removal  - " + Arrays.toString(newArray));
    }
}
