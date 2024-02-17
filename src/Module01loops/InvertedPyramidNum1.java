//10. Write A Program To Print Inverted Half Pyramid Pattern Using Numbers In Java
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
public class InvertedPyramidNum1 {
    public static void main(String[] args) {
        
        int limit = 5;

        for( int i=limit ; i>0 ; i--) { // backward loop

            for( int j=1 ; j<=i ; j++ ){ // prints the number
                System.out.print(j + " ");
            }
            System.out.println(); //prints nextline for exvery outter loop execution
        }

    }
    
}
