
public class RemoveFirstLastChar {
    public static void main(String[] args) {
        String test = "Element";
        StringBuilder newString = new StringBuilder();

        if (test.length() >= 2)
            newString.append(test.substring(1, test.length() - 1));
        else
            newString.append("");

        System.out.println("Original string: " + test);
        System.out.println("After Removal: " + newString);
    }
}
