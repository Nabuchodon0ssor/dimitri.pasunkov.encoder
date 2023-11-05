package com.javarush;
import java.util.ArrayList;
import java.util.Scanner;

public class CeasarCipher {

    ArrayList<Character> encryptedText = new ArrayList<>();
    public static int KEY;
    Scanner scan = new Scanner(System.in);
    public void initializeKey() {
        KEY = scan.nextInt();
        System.out.println("Inputted Key: " + KEY);
    }
    public void encryptInputtedText(ArrayList<Character> inputtedText) {
        for (char chars : inputtedText) {
            if (Constants.ALPHABET_EN.contains(chars)) {
                int index = Constants.ALPHABET_EN.indexOf(chars);
                while (Constants.ALPHABET_EN.size() - 1 - index < KEY) {
                    index = Math.abs(Constants.ALPHABET_EN.size() - index - KEY);
                }
                encryptedText.add(Constants.ALPHABET_EN.get(index));
            }

            if (chars == '\n') {
                encryptedText.add('\n');
            }
            else continue;
        }
        System.out.println("Encrypted Text: " + encryptedText);
    }

    public void decryptInputtedText(ArrayList<Character> inputtedText){

    }

    public void encryptFiledText(ArrayList<Character> inputtedText){

    }

    public void decryptFiledText(ArrayList<Character> inputtedText){

    }
}
