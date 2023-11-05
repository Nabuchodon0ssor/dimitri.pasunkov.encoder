package com.javarush;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    public static ArrayList<Character> inputtedText = new ArrayList<>();
    public void inputInitialText(){
        System.out.println("Please input the text to be encrypted. When the whole text is inputted, please write <<END>> from a new line");
        Scanner scan = new Scanner(System.in);
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

    public void inputKey(){
        System.out.println("Please input the key (from 1 to 25)");
        CeasarCipher key = new CeasarCipher();
        key.initializeKey();
    }
    public void inputEncryptedText(){
        System.out.println("Please input the encrypted text to be decrypted. When the whole text is inputted, please write <<END>> from a new line");
        SaveInputtedText save = new SaveInputtedText();
        save.saveInputtedText();

    }
}
