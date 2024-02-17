// 13.Create A Number Pyramid Program In Java
//           5
//         4 4 4
//       3 3 3 3 3 
//    2 2 2 2 2 2 2 2
//  1 1 1 1 1 1 1 1 1 1

public class NumberPyramid {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            for (int space = 0; space < rows - i; space++)
                System.out.print("  ");

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print((rows - i + 1) + " ");
            }
            System.out.println();
        }

    }
}
