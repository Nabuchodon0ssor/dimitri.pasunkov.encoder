package com.javarush;

public class FileService {
  public static ArrayList<Character> fileInitialText = new ArrayList<>();
  public static ArrayList<Character> fileEncryptedText = new ArrayList<>();
  
  String path = "filepath";
  
  
    
  public void saveInitialTextFromFile(String filePath){
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
 
public void writeEncryptedTextToFile(String newFilePath){
    File newFile = new File(newFilePath);
    PrintWriter pw = new PrintWriter(newFile);
     for (Character ch : fileEncryptedText) 
       {
         pw.print(ch);
       }
  pw.close();
}

  
  
}
