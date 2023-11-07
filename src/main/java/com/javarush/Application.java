package com.javarush;


public class Application {
    public static void main(String[] args) {

        Console console = new Console();
        CeasarCipher cypher = new CeasarCipher();

        console.inputInitialText();
        console.inputEncryptKey();
        cypher.encryptInputtedText(Console.inputtedInitialText, ENCRYPT_KEY);

        console.inputEncryptedText();
        console.inputDecryptKey();
        cypher.decryptInputtedText(Console.inputtedEncryptedText, DECRYPT_KEY);

    }
}

