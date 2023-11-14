package com.javarush;
import java.util.Scanner;

public class Console {
    Scanner scan = new Scanner(System.in);
    ConsoleTextService cts = new ConsoleTextService();
    FileService fs = new FileService();
    FileReader fr = new FileReader();
    FileWriter fw = new FileWriter();
    CaesarCipher cs = new CaesarCipher();

    public void welcomeMenu() {
                System.out.println("Welcome to the Text Encryption Software! Please write as number: \n" +
                        "1. If You want to input the text into the console \n" +
                        "2. If You want to choose a File with a text \n");
                int number = scan.nextInt();
                if (number == 1) {
                    consoleTextMenu();
                }
                if (number == 2) {
                    consoleFileMenu();
                }
                else welcomeMenu();
    }

    public void consoleTextMenu(){
            System.out.println("Please input the text. When the whole text is inputted, please write <<END>> from a new line");
            Texts.inputtedInitialText = cts.readInputtedText();
            System.out.println("The inputted text is: " + Texts.inputtedInitialText);
            System.out.println("Please input the encryption key: ");
            CaesarCipher.KEY = cts.scanKey();
            System.out.println("The encryption key is: " + CaesarCipher.KEY);
            Texts.inputtedTextEncrypted = cs.encryptText(Texts.inputtedInitialText,CaesarCipher.KEY);
            System.out.println("The encrypted text is: " + Texts.inputtedTextEncrypted);
            while(true) {
                System.out.println("Do You want to decrypt encrypted text back? Yes(1), No(2)");
                int number = scan.nextInt();
                if (number == 2) {
                    System.out.println("Thank You for using this software!");
                    break;
                }
                if (number == 1) {
                    Texts.inputtedTextDecrypted = cs.decryptText(Texts.inputtedTextEncrypted, CaesarCipher.KEY);
                    System.out.println("The decrypted text is: " + Texts.inputtedTextDecrypted);
                    System.out.println("Thank You for using this software!");
                    break;
                }
            }
    }
    public void consoleFileMenu(){
        System.out.println("Please input the file path. \n" +
                "Example: E:\\JavaRush\\dimitri.pasunkov.encoder\\src\\main\\java\\com\\javarush\\Poem.txt");
//      FileService.originalFilePath = scan.nextLine();
        FileService.originalFilePath = "E:\\JavaRush\\dimitri.pasunkov.encoder\\src\\main\\java\\com\\javarush\\Poem.txt";
        System.out.println("The file path is: " + FileService.originalFilePath);
        System.out.println("Please input the encryption key: ");
        CaesarCipher.KEY = cts.scanKey();
        System.out.println("The encryption key is: " + CaesarCipher.KEY);

        Texts.originalTextFromFile = fr.readTextFromFile(FileService.originalFilePath);
        Texts.encryptedFileText = cs.encryptText(Texts.originalTextFromFile,CaesarCipher.KEY);
        FileService.filePathEncrypted = fs.createEncryptedFile(FileService.originalFilePath);
        fw.writeTextToFile(Texts.encryptedFileText, FileService.filePathEncrypted);
        System.out.println("The new file with encrypted text is: " + FileService.filePathEncrypted);
        while(true) {
            System.out.println("Do You want to decrypt encrypted file back? Yes(1), No(2)");
            int number = scan.nextInt();
            if (number == 2) {
                System.out.println("Thank You for using this software!");
                break;
            }
            if (number == 1) {
                Texts.decryptedFileText = cs.decryptText(Texts.encryptedFileText, CaesarCipher.KEY);
                FileService.filePathDecrypted = fs.createDecryptedFile(FileService.filePathEncrypted);
                fw.writeTextToFile(Texts.decryptedFileText, FileService.filePathDecrypted);
                System.out.println("The new file with decrypted text is: " + FileService.filePathDecrypted);
                System.out.println("Thank You for using this software!");
                break;
            }
        }
    }
}
