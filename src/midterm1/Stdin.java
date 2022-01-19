package midterm1;

import java.util.Scanner;

public class Stdin {

    public static void main(String[] args) {
        /*
         * The below scanner object allows us to read in from the user since
         * we created a new Scanner and passed in 'System.in'
         */
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a filename: ");
        String fileName = userInput.nextLine();

        System.out.println("You chose this file: " + fileName);

        // Don't forget to close all Scanners!
        userInput.close();
    }

}
