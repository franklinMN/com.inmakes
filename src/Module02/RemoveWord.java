
public class RemoveWord {

    public static String removeWord(String test, String remove) {

        String[] strArray = test.split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : strArray) {
            if (!word.equals(remove)) {
                result.append(word)append(" ");
            }
        }

        return result.toString().trim();

    }

    public static void main(String[] args) {
        String test = "Remove the word from the given string.";
        String remove = "word";

        System.out.println("Original string: " + test);
        System.out.println("After Removal: " + removeWord(test, remove));
    }
}
