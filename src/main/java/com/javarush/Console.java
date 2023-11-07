package com.javarush;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    public static ArrayList<Character> inputtedInitialText = new ArrayList<>();
    public static ArrayList<Character> inputtedEncryptedText = new ArrayList<>();
    public void inputInitialText(){
        System.out.println("Please input the text to be encrypted. When the whole text is inputted, please write <<END>> from a new line");
        saveInitialText();
        System.out.println("Inputted Text: " + inputtedInitialText);
    }

    public void saveInitialText(){
        Scanner scan = new Scanner(System.in);
        while(true) {
            String line = scan.nextLine();
            if(line.equals("END")) break;
            char[] chars = line.toCharArray();
            for (char ch : chars) {
                inputtedInitialText.add(ch);
            }
//            inputtedInitialText.add('\n');
        }
        scan.close();
    }

    public void inputEncryptKey(){
        System.out.println("Please input the encrypting key");
        CeasarCipher key = new CeasarCipher();
        key.initializeEncryptKey();
    }
    public void inputEncryptedText(){
        System.out.println("Please input the encrypted text to be decrypted. When the whole text is inputted, please write <<END>> from a new line");
        Scanner scan = new Scanner(System.in);
        while(true) {
            String line = scan.nextLine();
            if(line.equals("END")) break;
            char[] chars = line.toCharArray();
            for (char ch : chars) {
                inputtedEncryptedText.add(ch);
            }
//            inputtedEncryptedText.add('\n');
        }
        System.out.println("Inputted Text: " + inputtedEncryptedText);
    }
    public void inputDecryptKey(){
        System.out.println("Please input the decrypting key");
        CeasarCipher key = new CeasarCipher();
        key.initializeDecryptKey();
    }
}
