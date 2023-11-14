package com.javarush;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public ArrayList<Character> readTextFromFile(String filePath) {
        ArrayList<Character> text = new ArrayList<>();
        try{
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            char[] chars = line.toCharArray();
            for (char ch : chars) {
                text.add(ch);
            }

        }
        scanner.close();
        }
        catch(Exception e){
            System.out.println("File not found");
        }

        return text;
    }
}
