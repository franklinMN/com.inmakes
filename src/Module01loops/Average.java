import java.util.Scanner;

public class Average {
    public static void main(String[] args){

        int n=5;
        int[] marks = new int[n];
        double average=0;

        Scanner scanner = new Scanner(System.in);

        for( int i=0 ; i<n ; i++ ) {
            System.out.print("Enter number " + (i + 1) + ": ");
            marks[i] = scanner.nextInt(); // reading the numbers
            average += marks[i]; // adding to get total
        }
            
        
        average = average / n;

        System.out.println("Average : " + average);

        scanner.close();

    }
}
