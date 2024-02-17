public class RepeatedCharacters {
    public static void main(String[] args) {
        String str = "This is an example to check the repeated characters in a string. Print the character which comes more than once.";
        printRepeatedCharacters(str);
    }

    public static void printRepeatedCharacters(String str) {

        char[] chars = str.toCharArray();
        int[] charCount = new int[256]; // Assuming ASCII characters

        for (char ch : chars) {
            if (ch != ' ') {
                charCount[(int) ch]++;
            }
        }

        System.out.println("Repeated characters in the string:");
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i] + " times");
            }
        }
    }
}
