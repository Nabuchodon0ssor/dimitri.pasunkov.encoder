package com.javarush;

public class FileService {
  public static ArrayList<Character> fileInitialText = new ArrayList<>();
  public static ArrayList<Character> fileEncryptedText = new ArrayList<>();
  String path = "filepath";
  
  
    
  public void saveFileInitialText(String path){
    File file = new File(path);
    Scanner scanner = new Scanner(file);
        
    while(scanner.hasNextLine()) {
            String line = scan.nextLine();
            char[] chars = line.toCharArray();
            for (char ch : chars) {
                fileInitialText.add(ch);
            }
//            fileInitialText.add('\n');
        }
        System.out.println("File Text: " + fileInitialText);
    scanner.close();
    }
 
 
  
}
