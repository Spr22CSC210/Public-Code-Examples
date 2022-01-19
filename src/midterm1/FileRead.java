package midterm1;

/*
 * This example shows how to read in a file. Notice that you have
 * to give the path of the file. This file lives inside of the 
 * TestCases folder. So to open it, you need to give the name of
 * "TestCases/InputTest01"
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("TestCases/InputTest01"));

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();

    }

}
