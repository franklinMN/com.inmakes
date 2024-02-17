//8. How to create a star pyramid pattern using ‘*’ in Java

public class Diamond {
    public static void main(String[] args) {

        char ch = '*';
        int limit = 5;

        // top part of the diamond
        for (int i = 0; i < limit; i++) { // forward loop

            for (int space = 0; space < limit - i; space++) { // creates space before the stars in every line
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) { // prints the star
                System.out.print(ch + " ");
            }
            System.out.println(); // prints nextline for exvery outter loop execution
        }

        // bottom part of the diamond
        for (int i = limit - 1; i > 0; i--) { // backward loop

            for (int space = 0; space <= limit - i; space++) { // creates space before the stars in every line
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) { // prints the star
                System.out.print(ch + " ");
            }
            System.out.println(); // prints nextline for exvery outter loop execution
        }
    }
}
