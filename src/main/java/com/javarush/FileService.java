package com.javarush;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileService {
  public static String originalFilePath;
  public static String filePathEncrypted;
  public static String filePathDecrypted;
      
  public void createEncryptedFile(String filePath) throws IOException {
    Files.createFile(Path.of(filePath+"[ENCRYPTED]"));
  }

  public void createDecryptedFile(String filePath) throws IOException {
    Files.createFile(Path.of(filePath+"[DECRYPTED]"));
  }


  
  
}
