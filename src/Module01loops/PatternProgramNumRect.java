// 15.Create A Pattern Program in java Using numbers

//  5 5 5 5 5
//  4 4 4 4 4
//  3 3 3 3 3
//  2 2 2 2 2
//  1 1 1 1 1

public class PatternProgramNumRect {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > 0; j--) {
                System.out.print(rows - i + " ");
            }
            System.out.println();
        }
    }

}
