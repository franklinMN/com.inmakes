
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // Popping an element from the stack
        int poppedItem = stack.pop();
        System.out.println("Popped item: " + poppedItem);

        // Peeking at the top element without removing it
        Integer topItem = stack.peek();
        System.out.println("Top item: " + topItem);

        // Checking if the stack is empty
        boolean isEmpty = stack.empty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Searching for an item in the stack
        int position = stack.search(10);
        System.out.println("Position of 10 in the stack: " + position);

        System.out.println("Stack - " +  stack.toString());
    }
}

