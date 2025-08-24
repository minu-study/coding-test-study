package main.java.main.java.solutions.section1;

import java.util.Scanner;

/**
 * Section 1 - String: 11. String Compression
 * Placeholder for study; no implementation.
 */
public class StringCompression {

    public static String stringCompression(Scanner in) {

        String str = in.next();
        return setCharacter(str);
    }

    private static String setCharacter(String input) {

        int cnt = 1;
        input = input + " ";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length() - 1; i++) {

            if (input.charAt(i) == input.charAt(i + 1)) {
                cnt++;
            } else {
                result.append(input.charAt(i));
                if (cnt > 1)
                    result.append(cnt);
                cnt = 1;
            }
        }
        return result.toString();

    }

}
