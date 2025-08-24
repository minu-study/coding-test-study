package main.java.main.java.solutions.section1;

import java.util.Scanner;

/**
 * Section 1 - String: 8. Valid Palindrome
 * Placeholder for study; no implementation.
 */
public class ValidPalindrome {

    public static String validPalindrome(Scanner in) {

        String input = in.nextLine().toLowerCase()
                .replaceAll("[^a-z]", "");
        return checkCharacter(input);
    }

    private static String checkCharacter(String input) {

        String result = "YES";
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i) )
                return "NO";
        }
        return result;
    }

}
