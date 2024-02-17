import java.util.Arrays;

class BinarySearch {

    public static void arrayDisplay( int[] arr ){
        System.out.print("Array Elements : [ ");
        for( int i:arr ) {
            System.out.print(i+ "  ");
        }
        System.out.print( " ]\n" );
    }

    public static int binarySearch( int[] arr, int target ){

        int low = 0;
        int high = arr.length - 1;
        int mid;

        while( low<=high ) {
            mid = low + (high-low)/2;

            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                low = mid+1;
            else if(arr[mid]>target)
                high = mid-1;
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int[] array = {4, 8, 23, -8, -9, 0, 56, 55, 33, -10}; //unsorted array
        int target = -10;

        Arrays.sort(array); // sorted array

        arrayDisplay(array);
        int result = binarySearch(array, target);

        if(result == -1)
            System.out.println("Target not found in the array.");
        else
            System.out.println("Target " + target + " is found at index " + result + ".");
    }
}