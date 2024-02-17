//9. Write A Java Program to Insert a New Element into An Array to the Specified
// Index.

import java.util.Arrays;

public class InsertArray {

    public static int[] insertIntoArray(int[] array, int value, int location){

        if(location<0 || location>=array.length){
            System.out.println("Location out of range.");
            return array;
        }
            
        int[] newArray = new int[array.length+1];

        System.arraycopy(array, 0, newArray, 0, location);
        newArray[location] = value;
        System.arraycopy(array, location, newArray, location+1, array.length-location);

        return newArray;
        
    }
    public static void main(String[] args) {
        int[] array = {4, 2, 6, 3, 2, 4, 5, 6, 1};
        int value = 6;
        int location = 6;

        System.out.println("Original Array - " + Arrays.toString(array));

        int[] newArray = insertIntoArray(array, value, location);

        System.out.println("After removal  - " + Arrays.toString(newArray));
    }
}
