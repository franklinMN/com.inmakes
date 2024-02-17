package Module01loops;

public class HollowRectangle {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        String fill = "* ";
        String empty = "  ";

        for(int i=0 ; i<rows ; i++) {
            for(int j=0 ; j<cols ; j++) {

                if( i==0 || i==rows-1 || j==0 || j==cols-1 )
                    System.out.print(fill);
                else
                    System.out.print(empty);
            }
            System.out.println();
        }
    }
    
}
