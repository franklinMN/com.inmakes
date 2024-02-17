// 3 Write a program to print reverse a of a string word by word

public class ReverseOfWords {

    public static String reverseOfWords(String text) {
        String[] words = text.split(" ");
        StringBuilder temp = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            temp.append(words[i]);
            temp.append(" ");
        }
        return temp.toString().trim();
    }

    public static void main(String[] args) {

        String text = "I am a developer";

        System.out.println("Original string - " + text);
        System.out.println("Toggeled string - " + reverseOfWords(text));
    }
}
