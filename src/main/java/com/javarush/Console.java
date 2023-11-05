package com.javarush;

public class Console {

    public void inputText(){
        System.out.println("Please input the text to be encrypted. When the whole text is inputted, please write <<END>> from a new line");
        SaveInputtedText save = new SaveInputtedText();
        save.saveInputtedText();

    }

    public void inputKey(){
        System.out.println("Please input the key (from 1 to 25)");
        CeasarCipher key = new CeasarCipher();
        key.initializeKey();
    }
}
