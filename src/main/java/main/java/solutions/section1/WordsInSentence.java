package main.java.main.java.solutions.section1;

/**
 * Section 1 - String: 3. Words in Sentence
 * Placeholder for study; no implementation.
 */
public class WordsInSentence {

    public static String getLongString(String input) {

        String[] Strings = input.split(" ");
        String result = "";

        for (String string : Strings) {
            if (string.length() > result.length()){
                result = string;
            }
        }
        return result.trim();
    }

}
