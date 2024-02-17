//8. How to create a star pyramid pattern using ‘*’ in Java

public class InvertedPyramid {
    public static void main(String[] args) {
        
        char ch = '*';
        int limit = 5;

        for( int i=limit ; i>0 ; i--) { // backward loop

            for( int space=0 ; space<=limit-i ; space++ ) { // creates space before the stars in every line
                System.out.print(" ");
            }

            for( int j=0 ; j<i ; j++ ){ // prints the star
                System.out.print(ch + " ");
            }
            System.out.println(); //prints nextline for exvery outter loop execution
        }
    }
}
