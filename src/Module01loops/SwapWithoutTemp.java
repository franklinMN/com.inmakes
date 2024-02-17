

public class SwapWithoutTemp {

    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 20;

        System.out.println("-----BEFORE SWAPPING-----");
        System.out.println("\tnum1 = " + num1);
        System.out.println("\tnum2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("-----AFTER SWAPPING-----");
        System.out.println("\tnum1 = " + num1);
        System.out.println("\tnum2 = " + num2);
    }
    
}
