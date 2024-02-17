// 2 Write a program to convert Given String onto uppercase and lowercase without
// using String method

public class ToggleCaseNoAPI {

    public static StringBuilder toggleString(String text) {

        // char[] ch = ;

        StringBuilder temp = new StringBuilder();

        for (char ch : text.toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {
                temp.append((char) (ch - 32));
            } else if (ch >= 'A' && ch <= 'Z') {
                temp.append((char) (ch + 32));
            } else {
                temp.append(ch);
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        String text = "This is a tOGGle ProGram.";
        System.out.println("Original string - " + text);
        System.out.println("Toggeled string - " + toggleString(text));
    }
}
