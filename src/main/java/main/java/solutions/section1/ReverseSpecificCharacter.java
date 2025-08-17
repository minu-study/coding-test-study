package main.java.main.java.solutions.section1;

import java.util.Scanner;

/**
 * Section 1 - String: 5. Reverse Specific Character
 * Placeholder for study; no implementation.
 */
public class ReverseSpecificCharacter {

    public static String reverseSpecificCharacter(Scanner in) {

        String input = in.nextLine();
        char[] inputArray = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;
        return setCharacter(inputArray, start, end);

    }

    private static String setCharacter(char[] inputArray, int start, int end) {

        while (start < end) {

            if (!Character.isAlphabetic(inputArray[start])) {
                start++;
                continue;
            }

            if (!Character.isAlphabetic(inputArray[end])) {
                end--;
                continue;
            }

            char temp = inputArray[start];
            inputArray[start] = inputArray[end];
            inputArray[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(inputArray);
    }

}
