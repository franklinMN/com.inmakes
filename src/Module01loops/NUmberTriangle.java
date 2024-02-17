// 12. Create A Number Pyramid Program In Java
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14
// 15 16 17 18 19
// 20 21 22 23 24 25

public class NUmberTriangle {
    public static void main(String[] args) {

        int limit = 7;
        int counter = 1;

        for (int i = 1; i <= limit; i++) { // forward loop
            // System.out.print("i value : " + i + " - ");
            for (int j = 1; j <= i; j++) { // prints the number
                System.out.print(counter++ + " ");
            }
            System.out.println(); // prints nextline for exvery outter loop execution
        }

    }

}
