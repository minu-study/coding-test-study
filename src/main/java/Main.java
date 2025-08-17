package main.java;

import main.java.main.java.solutions.section1.ReverseWords;
import main.java.main.java.solutions.section1.WordsInSentence;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        List<String> resultList = ReverseWords.reverseWords(in);
        for (String result : resultList) {
            System.out.println(result);
        }
    }

}