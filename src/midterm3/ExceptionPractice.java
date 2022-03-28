package midterm3;

import java.util.Scanner;

/*
 * We used this file to demonstrate Exceptions: throwing exceptions, try-catch.
 * We also leave a diagram for a callstack at the bottom of the file.
 */
public class ExceptionPractice {

    public static void main(String[] args) {
        topFunction();
        System.out.println("All done :)");
    }

    public static void topFunction() {
        middleFunction();
    }

    public static void middleFunction() {
        // try {
        // lastFunction(-2);
        // } catch (IllegalArgumentException e) {
        // System.out.println(e.getMessage());
        // }

        lastFunction(6);
    }

    public static void lastFunction(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age has to be greater than 0");
        }

        try {
            int x = 6 / 0;
            Scanner y = null;
            y.hasNext();
        } catch (NullPointerException e) {
            System.out.println("Null Pointer");
        }
    }

}
/*
 * This is what the callstack looks like when the exception occurs.
 * Each function gets its own space on the stack to store whatever variables
 * or object references it needs to store.
 * 
 * |--------------------|
 * |
 * | main
 * |
 * |
 * |--------------------|
 * |
 * | topFunction
 * |
 * |
 * |--------------------|
 * |
 * | middleFunction
 * |
 * |
 * |--------------------|
 * |
 * | lastFunction
 * |
 * |
 * |--------------------|
 */
