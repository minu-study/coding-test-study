package main.java;

import main.java.main.java.solutions.section1.*;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] result = ShortestCharacterDistance.shortestCharacterDistance(in);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}