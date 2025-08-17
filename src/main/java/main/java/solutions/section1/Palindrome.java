package main.java.main.java.solutions.section1;

import java.util.Scanner;

/**
 * Section 1 - String: 7. Palindrome
 * Placeholder for study; no implementation.
 */
public class Palindrome {

    public static String palindrome(Scanner in) {
        String input = in.nextLine().toLowerCase();
        return setCharacter(input);
    }

    private static String setCharacter(String input) {

        String result = "YES";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                return "NO";
            }
        }
        return result;
    }

}
