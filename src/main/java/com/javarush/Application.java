package com.javarush;


public class Application {
    public static void main(String[] args) {

        Console console = new Console();
        console.inputInitialText();
        console.inputKey();

        CeasarCipher cypher = new CeasarCipher();
        cypher.encryptInputtedText(Console.inputtedText);

    }
}

