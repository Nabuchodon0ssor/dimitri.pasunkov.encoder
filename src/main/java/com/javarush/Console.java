package com.javarush;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    // public static ArrayList<Character> inputtedInitialText = new ArrayList<>();
    // public static ArrayList<Character> inputtedEncryptedText = new ArrayList<>();

    CaesarCipher cs = new CaesarCipher();
    Scanner scan = new Scanner(System.in);

    public void run() {
            System.out.println("Welcome to the Text Encryption Software! Please write as number: \n" +
            "1. If You want to input the text into the console \n" +
            "2. If You want to choose a File with a text \n");
//            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            if(number==1) {consoleTextInput();
            }
            else if(number==2) {fileMenu();
            }
            else {System.out.println("Please enter 1 or 2");

            }

        }
    public void consoleTextInput(){
            System.out.println("Please input the text. When the whole text is inputted, please write <<END>> from a new line");
            saveInputtedText(); //Text saved to Texts.inputtedInitialText
            System.out.println("The inputted text is: " + Texts.inputtedInitialText);
            consoleMenu2();
    }

    public void consoleMenu2(){
            System.out.println("Please Please write as number: \n" +
                    "1. If You want to encrypt entered text, using a key \n" +
                    "2. If You want to decrypt entered text, using a key \n" +
                    "3. If You want to decrypt entered text, using a brute force method (without key) \n" +
                    "4. If You want go back to previous menu");

//            Scanner scan2 = new Scanner(System.in);
            int number2 = scan.nextInt();
            if (number2 == 1) {consoleEncryptingText();}
            else if (number2 == 2) {consoleDecryptingText();}
            else if (number2 == 3) consoleMenu2();
            else if (number2 == 4) {run();}
            else {
            System.out.println("Please enter 1,2,3 or 4");}
    }
    public void consoleEncryptingText(){
        System.out.println("Please enter a key: ");
        CaesarCipher.ENCRYPT_KEY = scan.nextInt();
        System.out.println("Encrypt key is: "+ CaesarCipher.ENCRYPT_KEY);

        cs.encryptText(Texts.inputtedInitialText,CaesarCipher.ENCRYPT_KEY); //Text saved to Texts.inputtedTextEncrypted
        System.out.println("Encrypted text is: \n" +
                Texts.inputtedTextEncrypted);
        consoleMenu3();
    }
    public void consoleMenu3(){

        System.out.println("Do You want to decrypt encrypted text back? \n" +
                "1. Yes \n" +
                "2. No");
        int number = scan.nextInt();
        if(number==1) consoleDecryptingText();
        if(number==2) System.out.println("Thank You for using this Software!");
        else consoleMenu3();
    }

    public void consoleDecryptingText(){
//        System.out.println("Please enter a key: ");
////        Scanner scan = new Scanner(System.in);
//        CaesarCipher.DECRYPT_KEY = scan.nextInt();
        CaesarCipher.DECRYPT_KEY = CaesarCipher.ENCRYPT_KEY;
        System.out.println("Decrypt key is: "+ CaesarCipher.DECRYPT_KEY);

        cs.decryptText(Texts.inputtedTextEncrypted,CaesarCipher.DECRYPT_KEY); //Text saved to Texts.inputtedTextDecrypted
        System.out.println("Decrypted text is: \n" +
                Texts.inputtedTextDecrypted);
    }
    public void fileMenu(){
        System.out.println();
    }


    public ArrayList<Character> saveInputtedText(){
//        Scanner scan = new Scanner(System.in);
        while(true) {
            String line = scan.nextLine();
            if(line.equals("END")) break;
            char[] chars = line.toCharArray();
            for (char ch : chars) {
                Texts.inputtedInitialText.add(ch);
            }
//            inputtedInitialText.add('\n');
        }
         return Texts.inputtedInitialText;
    }

    public int scanKey() {
//        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();
//        scan.close();
        return key;
    }
    
    public void inputEncryptKey(){
        System.out.println("Please input the encrypting key");
        CaesarCipher.ENCRYPT_KEY = scanKey();
    }
    public void inputEncryptedText(){
        System.out.println("Please input the encrypted text to be decrypted. When the whole text is inputted, please write <<END>> from a new line");
        ArrayList<Character> inputtedEncryptedText = saveInputtedText();
        System.out.println("Inputted Text: " + inputtedEncryptedText);
    }

    
    public void inputDecryptKey(){
        System.out.println("Please input the decrypting key");
        CaesarCipher.DECRYPT_KEY = scanKey();
    }
}
