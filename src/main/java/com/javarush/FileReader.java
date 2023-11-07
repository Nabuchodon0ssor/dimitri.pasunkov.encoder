package com.javarush;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public ArrayList<Character> scanTextFromFile(String filePath) throws FileNotFoundException {
        ArrayList<Character> text = new ArrayList<>();
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            char[] chars = line.toCharArray();
            for (char ch : chars) {
                text.add(ch);
            }
//            fileInitialText.add('\n');
        }
        scanner.close();
        return text;
    }
}
