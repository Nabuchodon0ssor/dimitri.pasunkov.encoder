package com.javarush;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CaesarCipher {

       
    public static int ENCRYPT_KEY;
    public static int DECRYPT_KEY;
    
    
    public ArrayList<Character> encryptText(ArrayList<Character> inputtedInitialText, int key) {
        
        for (char chars : inputtedInitialText) {
            int position = Constants.ALPHABET_EN.indexOf(chars);
            int encryptIndex = (key + position) % 26;
            Texts.inputtedTextEncrypted.add(Constants.ALPHABET_EN.get(encryptIndex));

//            if (chars == '\n') {
//                encryptedText.add('\n');
//            }
        }
        return Texts.inputtedTextEncrypted;
    }

    public ArrayList<Character> encryptFile(String filePath, int key) {
        FileReader fs = new FileReader();
        try{        Texts.originalTextFromFile = fs.scanTextFromFile(filePath);}
        catch(FileNotFoundException e){
            System.out.println("File not exists");
        }
           
        for (char chars : Texts.originalTextFromFile) {
            int position = Constants.ALPHABET_EN.indexOf(chars);
            int encryptIndex = (key + position) % 26;
            Texts.encryptedFileText.add(Constants.ALPHABET_EN.get(encryptIndex));

//            if (chars == '\n') {
//                Texts.fileTextEncrypted.add('\n');
//            }
        }
        return Texts.encryptedFileText;
    }   

    public ArrayList<Character> decryptText(ArrayList<Character> text, int key){
       
        for (char chars : text) {
            int position = Constants.ALPHABET_EN.indexOf(chars);
            int decryptIndex = (position - key) % 26;
            if(decryptIndex<0){
                decryptIndex = Constants.ALPHABET_EN.size() + decryptIndex;
            }
            Texts.inputtedTextDecrypted.add(Constants.ALPHABET_EN.get(decryptIndex));

//            if (chars == '\n') {
//                Texts.decryptedText.add('\n');
//            }
        }
        return Texts.inputtedTextDecrypted;
    }

       public ArrayList<Character> decryptFile(String filePath, int key) {
           FileReader fs = new FileReader();
           try{Texts.encryptedFileText = fs.scanTextFromFile(filePath);}
           catch(FileNotFoundException e){
               System.out.println("File not exists");
           }
        for (char chars : Texts.encryptedFileText) {
            int position = Constants.ALPHABET_EN.indexOf(chars);
            int decryptIndex = (position - key) % 26;
            if(decryptIndex<0){
                decryptIndex = Constants.ALPHABET_EN.size() + decryptIndex;
            }
            Texts.decryptedFileText.add(Constants.ALPHABET_EN.get(decryptIndex));
//
//            if (chars == '\n') {
//                Texts.decryptedText.add('\n');
//            }
        }
        return Texts.decryptedFileText;
    }

//    public ArrayList<Character> decryptTextBruteForce(ArrayList<Character> inputtedInitialText, int key){
//
//    }
//    public ArrayList<Character> decryptFileBruteForce(String filePath, int key){}
    
}
