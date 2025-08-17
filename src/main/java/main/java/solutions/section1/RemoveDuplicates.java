package main.java.main.java.solutions.section1;

import java.util.Scanner;

/**
 * Section 1 - String: 6. Remove Duplicates
 * Placeholder for study; no implementation.
 */
public class RemoveDuplicates {

    public static String removeDuplicates(Scanner in) {
        String input = in.nextLine();
        return setCharacter(input);
    }

    private static String setCharacter(String input) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == i) {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }

}
