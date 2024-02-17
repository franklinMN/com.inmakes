package Module01Array;

//6. How To Check Whether Two String Are Anagram or not.

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram( String text1, String text2 ){

        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();

        char[] ch1 = text1.toCharArray();
        char[] ch2 = text2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        text1 = new String(ch1);
        text2 = new String(ch2);

        // System.out.println("Text1 = " + text1);
        // System.out.println("Text2 = " + text2);

        return text1.equals(text2);

    }
    public static void main(String[] args) {
        
        String text1 = "lisTen";
        String text2 = "siLeNt";

        if(isAnagram(text1, text2))
            System.out.println("Two string are Anagram.");
        else
            System.out.println("Two string are NOT a Anagram.");
    }
}
