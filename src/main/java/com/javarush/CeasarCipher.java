package com.javarush;
import java.util.ArrayList;
import java.util.Scanner;

public class CeasarCipher {

       
    public static int ENCRYPT_KEY;
    public static int DECRYPT_KEY;
    
    
    public ArrayList<Character> encryptInputtedText(ArrayList<Character> inputtedInitialText, int key) {
        ArrayList<Character> encryptedText = new ArrayList<>();
        for (char chars : inputtedInitialText) {
            int position = Constants.ALPHABET_EN.indexOf(chars);
            int encryptIndex = (key + position) % 26;
            encryptedText.add(Constants.ALPHABET_EN.get(encryptIndex));
//
//            if (chars == '\n') {
//                encryptedText.add('\n');
//            }
        }
        System.out.println("Encrypted Text: " + encryptedText);
        return encryptedText;
    }

    public ArrayList<Character> decryptInputtedText(ArrayList<Character> inputtedEncryptedText, int key){
        ArrayList<Character> decryptedText = new ArrayList<>();
        for (char chars : inputtedEncryptedText) {
            int position = Constants.ALPHABET_EN.indexOf(chars);
            int decryptIndex = (position - key) % 26;
            if(decryptIndex<0){
                decryptIndex = Constants.ALPHABET_EN.size() + decryptIndex;
            }
            decryptedText.add(Constants.ALPHABET_EN.get(decryptIndex));
//
//            if (chars == '\n') {
//                decryptedText.add('\n');
//            }
        }
        System.out.println("Encrypted Text: " + decryptedText);
        return decryptedText;
    }

    public void encryptFiledText(ArrayList<Character> inputtedText){

    }

    public void decryptFiledText(ArrayList<Character> inputtedText){

    }
}
