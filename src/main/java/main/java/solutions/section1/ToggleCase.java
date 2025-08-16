package main.java.main.java.solutions.section1;

/**
 * Section 1 - String: 2. Toggle Case
 * Placeholder for study; no implementation.
 */
public class ToggleCase {

    public static String setCharacter(String[] input) {

        String result = "";
        if (input.length == 0){
            return result;
        } else {
            for (char c : input[0].toCharArray()) {
                if (Character.isUpperCase(c)){
                    result = result + Character.toLowerCase(c);
                } else {
                    result = result + Character.toUpperCase(c);
                }
            }
        }
        return result;
    }

}
