package main.java;

import main.java.main.java.solutions.section1.ReverseSpecificCharacter;
import main.java.main.java.solutions.section1.ReverseWords;
import main.java.main.java.solutions.section1.WordsInSentence;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String result = ReverseSpecificCharacter.reverseSpecificCharacter(in);
        System.out.println(result);
    }

}