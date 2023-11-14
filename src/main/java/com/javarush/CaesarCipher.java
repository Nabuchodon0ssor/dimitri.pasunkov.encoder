package com.javarush;
import java.util.ArrayList;

public class CaesarCipher {
    public static int KEY;
    public ArrayList<Character> encryptText(ArrayList<Character> inputtedInitialText, int key) {
        ArrayList<Character> encryptedText = new ArrayList<>();
        for (char chars : inputtedInitialText) {
            if(Constants.ALPHABET_EN.contains(chars)) {
                int position = Constants.ALPHABET_EN.indexOf(chars);
                int encryptIndex = (key + position) % 26;
                encryptedText.add(Constants.ALPHABET_EN.get(encryptIndex));
            }
            else encryptedText.add(chars);
        }
        return encryptedText;
    }
    public ArrayList<Character> decryptText(ArrayList<Character> text, int key){
        ArrayList<Character> decryptedText = new ArrayList<>();
        for (char chars : text) {
            if(Constants.ALPHABET_EN.contains(chars)) {
                int position = Constants.ALPHABET_EN.indexOf(chars);
                int decryptIndex = (position - key) % 26;
                if (decryptIndex < 0) {
                    decryptIndex = Constants.ALPHABET_EN.size() + decryptIndex;
                }
                decryptedText.add(Constants.ALPHABET_EN.get(decryptIndex));
            }
            else decryptedText.add(chars);
//            if (chars == '\n') {
//                Texts.decryptedText.add('\n');
//            }
        }
        return decryptedText;
    }
}
