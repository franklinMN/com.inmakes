//7. Write a program to check whether the input year is Leap year or not

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year to check : ");
        year = scan.nextInt();

        if( ( year%4==0 && year%100!=0  ) || (year%400 == 0) )
            System.out.println(year + " is a LEAP year.");
        else
            System.out.println(year + " is NOT a LEAP year.");

            scan.close();
    }

}
