package main.java;

import main.java.main.java.solutions.section1.ToggleCase;
import main.java.main.java.solutions.section1.WordsInSentence;

public class Main {

    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);
        String line = in.nextLine();
        String result = WordsInSentence.getLongString(line);
        System.out.println(result);
    }

}