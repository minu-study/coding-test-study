package main.java.main.java.solutions.section1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Section 1 - String: 10. Shortest Character Distance
 * Placeholder for study; no implementation.
 */
public class ShortestCharacterDistance {

    public static int[] shortestCharacterDistance(Scanner in) {

        String str = in.next();
        char[] strArray = str.toCharArray();
        char ch =  in.next().charAt(0);

        int[] answerArrayTemp = getTempDistance(strArray, ch);
        int[] answerArray = getFinalDistance(strArray, ch, answerArrayTemp);
        return answerArray;
    }

    private static int[] getTempDistance(char[] strArray, char ch) {

        int[] answerArray = new int[strArray.length];
        int answerIndex = 1000;
        for (int i = 0; i < strArray.length; i++) {

            if (strArray[i] == ch) {
                answerIndex = 0;
            } else {
                answerIndex++;
            }
            answerArray[i] = answerIndex;
        }

        return answerArray;

    }

    private static int[] getFinalDistance(char[] strArray, char ch, int[] answerArray) {

        int answerIndex = 1000;
        for (int i = strArray.length - 1; i >= 0; i--) {

            if (strArray[i] == ch) {
                answerIndex = 0;
            } else {
                answerIndex++;
            }

            if (answerArray[i] > answerIndex)
                answerArray[i] = answerIndex;
        }

        return answerArray;

    }

}
