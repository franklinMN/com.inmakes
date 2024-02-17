
public class CountVowelsFromString {

    public static int numberOfVowels(String str) {

        int count = 0;

        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String test = "Count the number of vowels from this string";
        // String test = "aeiou";

        int count = numberOfVowels(test);

        System.out.println("Number of vowels in the given string : " + count);

    }

}
