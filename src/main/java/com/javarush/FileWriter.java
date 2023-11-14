package com.javarush;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileWriter {
    public void writeTextToFile(ArrayList<Character> text, String newFilePath) {
        File newFile = new File(newFilePath);

        try{PrintWriter pw = new PrintWriter(newFile);
        for (Character ch : text)
        {
            pw.print(ch);
        }
        pw.close();}
        catch(Exception e){e.printStackTrace();}
    }
}
