package midterm1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Mirror {

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("a");
        q.add("b");
        q.add("c");
        mirror(q);
        System.out.println(q);
    }

    /*
     * Write a function that accepts a queue of strings and appends the
     * queue’s contents to itself in reverse order.
     * For example: {“a”, “b”, “c”} becomes {“a”, “b”, “c”, “c”, “b”, “a”}
     */
    public static void mirror(Queue<String> q) {
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < q.size(); i++) {
            String value = q.remove();
            q.add(value);
            stack.push(value);
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
    }
}
