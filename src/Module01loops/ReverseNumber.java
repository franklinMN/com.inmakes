class ReverseNumber {
    public static void main( String[] args ) {


        int number = 123456789;
        int reversedNumber=0;
        int quo=number, rem=0;

        while(quo!=0) {
            rem = quo % 10;
            reversedNumber = reversedNumber*10 + rem;
            quo = quo / 10;
        }

        System.out.println("Original Number : " + number);
        System.out.println("Reversed Number : " + reversedNumber);

    }
}