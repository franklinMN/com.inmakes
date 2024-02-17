class Palindrome {
    public static void main( String[] args ) {


        int number = 153;
        int reversedNumber=0;
        int quo=number, rem=0;

        while(quo!=0) {
            rem = quo % 10;
            reversedNumber = reversedNumber*10 + rem;
            quo = quo / 10;
        }

        System.out.println("Original Number : " + number);
        System.out.println("Reversed Number : " + reversedNumber);

        if( number==reversedNumber )
            System.out.println("It is PALINDROME.");
        else
            System.out.println("It is NOT A PALINDROME.");

    }
}