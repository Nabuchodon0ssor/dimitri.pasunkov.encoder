package com.javarush;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleTextService {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Character> readInputtedText(){
        ArrayList<Character> inputtedText = new ArrayList<>();
        while(true) {
            String line = scanner.nextLine();
            if(line.equals("END")) break;
            char[] chars = line.toCharArray();
            for (char ch : chars) {
                inputtedText.add(ch);
            }
//            inputtedInitialText.add('\n');
        }
        return inputtedText;
    }
    public int scanKey() {
        int key = scanner.nextInt();
        return key;
    }
}
