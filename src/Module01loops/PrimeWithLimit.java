//5. Write a java program to print prime numbers within limits

public class PrimeWithLimit {
    public static void main(String[] args) {
        
        int lowLimit = 1;
        int highLimit = 100;
        boolean isPrime;

        for( int num=lowLimit ; num<=highLimit ; num++ ){

            isPrime = true;

            if(num<=1) // used to filter negative numbers and 0, 1
                continue;
            for( int i=2 ; i <= Math.sqrt(num) ; i++ ){
                if( num%i == 0 ) {
                    isPrime = false;
                    break;
                }  
            }
            System.out.print( isPrime ? num + " " : "" );
        }
        System.out.println();
    }
}
