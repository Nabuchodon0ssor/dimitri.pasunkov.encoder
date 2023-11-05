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
            int index = Constants.ALPHABET_EN.indexOf(chars);
            int encryptIndex = (KEY + index) % 26;
            encryptedText.add(Constants.ALPHABET_EN.get(encryptIndex));

            if (chars == '\n') {
                encryptedText.add('\n');
            }
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
