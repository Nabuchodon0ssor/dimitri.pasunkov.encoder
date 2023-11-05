package com.javarush;


public class Application {
    public static void main(String[] args) {

        Console console = new Console();
        console.inputText();
        console.inputKey();

        CeasarCipher cypher = new CeasarCipher();
        cypher.encryptInputtedText(SaveInputtedText.inputtedText);

    }
}

