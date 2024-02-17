// 2 Write a program to convert Given String onto uppercase and lowercase without
// using String

public class ToggleCaseWithAPI {

    public static String toggleString(String text){
        StringBuilder temp = new StringBuilder();

        for( char ch : text.toCharArray() ){

            if(Character.isLetter(ch)){
                //if lower case
                if(Character.isLowerCase(ch))
                    temp = temp.append(Character.toUpperCase(ch));
                
                if(Character.isUpperCase(ch))
                    temp = temp.append(Character.toLowerCase(ch));

            }else {
                temp = temp.append(ch);
            }
        }
        return temp.toString();
    }

    public static void main(String[] args) {
        String text = "This is a tOGGle ProGram.";

        System.out.println("Original string - " + text);
        System.out.println("Toggeled string - " + toggleString(text));
    }
}
