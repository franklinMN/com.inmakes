// 14. Create A Pattern Program In Java Using Letters
//  A B C D E
//  A B C D
//  A B C
//  A B
//  A

public class InvertedTriangleAlpha {
    public static void main(String[] args) {
        
        int limit = 5;
        char alpha;

        for( int i=limit ; i>0 ; i--) { // backward loop
            alpha = 'A';
            for( int j=1 ; j<=i ; j++ ){ // prints the Alphabet
                System.out.print(alpha + " ");
                alpha = (char) (alpha + 1);
            }
            System.out.println(); //prints nextline for exvery outter loop execution
        }

    }
    
}
