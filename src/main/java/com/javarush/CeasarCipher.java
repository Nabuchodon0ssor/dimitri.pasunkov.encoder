package com.javarush;
import java.util.ArrayList;
import java.util.Scanner;

public class CeasarCipher {

       
    public static int ENCRYPT_KEY;
    public static int DECRYPT_KEY;
    
    
    public ArrayList<Character> encryptText(ArrayList<Character> inputtedInitialText, int key) {
        
        for (char chars : inputtedInitialText) {
            int position = Constants.ALPHABET_EN.indexOf(chars);
            int encryptIndex = (key + position) % 26;
            Texts.encryptedText.add(Constants.ALPHABET_EN.get(encryptIndex));
//
//            if (chars == '\n') {
//                encryptedText.add('\n');
//            }
        }
        System.out.println("Encrypted Text: " + Texts.encryptedText);
        return Texts.encryptedText;
    }

    public ArrayList<Character> encryptText(String filePath, int key) {
        Texts.InitialFileText... = new FileService.scanTextFromFile(filePath);
           
        for (char chars : inputtedInitialText) {
            int position = Constants.ALPHABET_EN.indexOf(chars);
            int encryptIndex = (key + position) % 26;
            Texts.fileTextEncrypted.add(Constants.ALPHABET_EN.get(encryptIndex));
//
//            if (chars == '\n') {
//                Texts.fileTextEncrypted.add('\n');
//            }
        }
        System.out.println("Encrypted Text: " + Texts.fileText);
        return Texts.fileTextEncrypted;
    }   

    public ArrayList<Character> decryptText(ArrayList<Character> inputtedEncryptedText, int key){
       
        for (char chars : inputtedEncryptedText) {
            int position = Constants.ALPHABET_EN.indexOf(chars);
            int decryptIndex = (position - key) % 26;
            if(decryptIndex<0){
                decryptIndex = Constants.ALPHABET_EN.size() + decryptIndex;
            }
            Texts.decryptedText.add(Constants.ALPHABET_EN.get(decryptIndex));
//
//            if (chars == '\n') {
//                Texts.decryptedText.add('\n');
//            }
        }
        System.out.println("Encrypted Text: " + Texts.decryptedText);
        return Texts.decryptedText;
    }

       public ArrayList<Character> decryptText(String filePath, int key){
       Texts.fileText... = new FileService.scanTextFromFile(filePath);
        for (char chars : Texts.fileText) {
            int position = Constants.ALPHABET_EN.indexOf(chars);
            int decryptIndex = (position - key) % 26;
            if(decryptIndex<0){
                decryptIndex = Constants.ALPHABET_EN.size() + decryptIndex;
            }
            Texts.decryptedText.add(Constants.ALPHABET_EN.get(decryptIndex));
//
//            if (chars == '\n') {
//                Texts.decryptedText.add('\n');
//            }
        }
        System.out.println("Encrypted Text: " + Texts.decryptedText);
        return Texts.decryptedText;
    }
    
}
