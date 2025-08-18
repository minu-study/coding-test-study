package main.java.main.java.solutions.section1;

import java.util.Scanner;

/**
 * Section 1 - String: 9. Extract Only Numbers
 * Placeholder for study; no implementation.
 */
public class ExtractOnlyNumbers {

    public static int extractOnlyNumbers(Scanner in) {
        String input = in.nextLine().replaceAll("[^0-9]", "");
        return Integer.parseInt(input);
    }
}
