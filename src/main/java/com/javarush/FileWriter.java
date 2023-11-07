package com.javarush;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileWriter {
    public void writeTextToFile(ArrayList<Character> text, String newFilePath) throws FileNotFoundException {
        File newFile = new File(newFilePath);
        PrintWriter pw = new PrintWriter(newFile);
        for (Character ch : text)
        {
            pw.print(ch);
        }
        pw.close();
    }
}
