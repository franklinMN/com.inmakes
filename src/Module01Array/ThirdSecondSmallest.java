//2. How To Find Third Largest and Second Smallest Element in An Array.

import java.util.Scanner;

public class ThirdSecondSmallest {
    public static void main(String[] args) {
        
        int n=5;
        int[] array = new int[n];
        int firstLargest, secondLargest, thirdLargest;
        int firstSmallest, secondSmallest;

        Scanner scan = new Scanner(System.in);

        //Getting array elements from user
        System.out.println("Enter the " + n + " array elements one by one : ");
        for(int i=0 ; i<n ; i++) {
            System.out.print("Enter value " + (i+1) + " : ");
            array[i] = scan.nextInt();
        }

        //find third Largest and Second Smallest Element in An Array...
        firstLargest = secondLargest = thirdLargest = Integer.MIN_VALUE;
        firstSmallest = secondSmallest = Integer.MAX_VALUE;

        for( int i=0 ; i<n ; i++ ) {

            // third largest element in the array
            if( array[i] > firstLargest ){
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = array[i];
            }else if( array[i] > secondLargest ){
                thirdLargest = secondLargest;
                secondLargest = array[i];
            }else if( array[i] > thirdLargest ){
                thirdLargest = array[i];
            }

            // third largest element in the array
            if( array[i] < firstSmallest ) {
                secondSmallest = firstSmallest;
                firstSmallest = array[i];
            }else if( array[i] < secondSmallest ){
                secondSmallest = array[i];
            }
        }

        //Displaying array elements...
        System.out.println("Displaying the array element : ");
        System.out.print("Array  -  ");
        for(int i=0 ; i<n ; i++) {
            System.out.print( array[i] + " " );
        }
        System.out.println();

        //displaying the awnsers
        System.out.println("Third Largest element  : " + thirdLargest);
        System.out.println("Second Largest element : " + secondSmallest);

        scan.close();
    }
}
