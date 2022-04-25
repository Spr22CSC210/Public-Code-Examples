package midterm4;

import java.util.TreeSet;

public class Subsets {
    public static void main(String[] args) {
        TreeSet<Character> chars = new TreeSet<>();
        chars.add('c');
        chars.add('a');
        chars.add('t');
        printSubsets(chars);
    }

    /*
     * Should print:
     * cat
     * ca
     * ct
     * at
     * c
     * a
     * t
     * _
     */
    private static void printSubsets(TreeSet<Character> chars) {
        printHelper(chars, new TreeSet<Character>());
    }

    private static void printHelper(TreeSet<Character> chars,
            TreeSet<Character> soFar) {
        if (chars.isEmpty()) {
            System.out.println(soFar);
        } else {
            Character choice = chars.first();
            
            chars.remove(choice);
            
            printHelper(chars, soFar);
            
            soFar.add(choice);
            printHelper(chars, soFar);

            soFar.remove(choice);
        }
    }
}
