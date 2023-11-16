package com.javarush;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileService {
  public static String originalFilePath = null;
  public static String filePathEncrypted = null;
  public static String filePathDecrypted = null;

  public String createEncryptedFile(String originalFilePath) {
    Path path = null;
        try{
      Files.deleteIfExists(Path.of(originalFilePath+"[ENCRYPTED]"));
      path = Files.createFile(Path.of(originalFilePath+"[ENCRYPTED]"));
    }
    catch(Exception e){
      System.out.println("File not found");
    }
 
    return path != null ? path.toString() : null;
  }

  public String createDecryptedFile(String filePath) {
    Path path = null;
    try{
      Files.deleteIfExists(Path.of(filePath+"[DECRYPTED]"));
      path = Files.createFile(Path.of(filePath+"[DECRYPTED]"));
    }
    catch(Exception e){
      System.out.println("File not found");
    }
    return path != null ? path.toString() : null;
  }
}
