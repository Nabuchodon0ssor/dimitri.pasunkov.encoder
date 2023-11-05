package com.javarush;
import java.util.ArrayList;
import java.util.Scanner;

public class CeasarCipher {

    ArrayList<Character> encryptedText = new ArrayList<>();
    ArrayList<Character> decryptedText = new ArrayList<>();
    public static int ENCRYPT_KEY;
    public static int DECRYPT_KEY;
    Scanner scan = new Scanner(System.in);
    public void initializeEncryptKey() {
        ENCRYPT_KEY = scan.nextInt();
        System.out.println("Inputted Key: " + ENCRYPT_KEY);
    }
    public void initializeDecryptKey() {
        DECRYPT_KEY = scan.nextInt();
        System.out.println("Inputted Key: " + DECRYPT_KEY);
    }
    public void encryptInputtedText(ArrayList<Character> inputtedInitialText) {
        for (char chars : inputtedInitialText) {
            int position = Constants.ALPHABET_EN.indexOf(chars);
            int encryptIndex = (ENCRYPT_KEY + position) % 26;
            encryptedText.add(Constants.ALPHABET_EN.get(encryptIndex));
//
//            if (chars == '\n') {
//                encryptedText.add('\n');
//            }
        }
        System.out.println("Encrypted Text: " + encryptedText);
    }

    public void decryptInputtedText(ArrayList<Character> inputtedEncryptedText){
        for (char chars : inputtedEncryptedText) {
            int position = Constants.ALPHABET_EN.indexOf(chars);
            int decryptIndex = (position - ENCRYPT_KEY) % 26;
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

    }

    public void encryptFiledText(ArrayList<Character> inputtedText){

    }

    public void decryptFiledText(ArrayList<Character> inputtedText){

    }
}
