package main.java.main.java.solutions.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Section 1 - String: 4. Reverse Words
 * Placeholder for study; no implementation.
 */
public class ReverseWords {

    public static List<String> reverseWords(Scanner in) {

        List<String> result = new ArrayList<>();
        int n = in.nextInt();
        String[] inputArray = new String[n];
        for(String input : inputArray) {
            input = in.next();
            result.add(reverse(input));
        }
        return result;
    }

    private static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
