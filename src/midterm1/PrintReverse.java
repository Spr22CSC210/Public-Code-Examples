package midterm1;

import java.util.Stack;

public class PrintReverse {

    public static void main(String[] args) {
        String example = "Hello my name is Inigo Montoya";
        String[] parts = example.split(" ");
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < parts.length; i++) {
            stack.push(parts[i]);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

}
