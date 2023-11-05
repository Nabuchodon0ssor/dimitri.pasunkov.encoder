package com.javarush;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveInputtedText {

    public static ArrayList<Character> inputtedText = new ArrayList<>();

    Scanner scan = new Scanner(System.in);
    public void saveInputtedText(){
        while(true) {
            String line = scan.nextLine();
            if(line.equals("END")) break;
            char[] chars = line.toCharArray();
            for (char ch : chars) {
                inputtedText.add(ch);
            }
            inputtedText.add('\n');
        }
        System.out.println("Inputted Text: " + inputtedText);
    }
}
