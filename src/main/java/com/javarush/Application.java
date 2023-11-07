package com.javarush;


public class Application {
    public static void main(String[] args) {

        Console console = new Console();
        CeasarCipher cypher = new CeasarCipher();

        console.inputInitialText();
        console.inputEncryptKey();
        cypher.encryptInputtedText(Console.inputtedInitialText, ENCRYPT_KEY);

        console.inputEncryptedText();
        console.inputDecryptKey();
        cypher.decryptInputtedText(Console.inputtedEncryptedText, DECRYPT_KEY);


        // Добро пожаловать в программу шифрования текста! Если текст, который надо зашифровать/ дешифровать, находится в текстовом файле, введите File, если Вы хотите произвести ввод вручную, введите Input
                // if File -> Введите путь к файлу с текстом
                // scan FilePath
                // save FilePath
                // Вы хотите зашифровать файл (E), расшифровать с известным ключом (D), либо расшифровать взломом (B)
                //  E or D
                // Введите ключ
                // scan Key
                // save Key
                            // If E -> encryptText(FilePath, key)
                            // new File -> ENCRYPTED+oldFilePath
                            // writeTextToFile (Text, newEncryptedFilePath)
                            // Исходный текст зашифрован и находится в новом файле FileSrevice.newEncryptedFilePath! 

                            // If D -> decryptText(FilePath, key)
                            // new File -> DECRYPTED+oldFilePath
                            // saveTextToFile (newDecryptedFilePath)
                            // Расшифрованный текст находится в файле FileSrevice.newDecryptedFilePath! 

                            // If (B) -> bruteForce(FilePath, key)
                            // new File -> DECRYPTED+oldFilePath
                            // saveTextToFile (newDecryptedFilePath)
                            // Расшифрованный текст находится в файле FileSrevice.newDecryptedFilePath! 

                // If Input -> Введите текст, в конце END
                // scan Text + saveInputtedText
                // Зашифровать (E), расшифровать с известным ключом (D), bruteForce (B)
                //  E or D
                // Введите ключ
                // scan Key
                // save Key
                            // If E -> Texts.encrypted Text = encryptText(InputtedText, key)
                            // Исходный текст : ... sout   (Texts.encrypted Text)  

                            // If D -> Texts.decryptedText = decryptText(InputtedText, key)
                            // Исходный текст : ... sout  (Texts.decryptedText) 

                            // If (B) -> Texts.decryptedText = bruteForce(InputtedText, key)
                            // Исходный текст : ... sout (Texts.decryptedText) 







        
        
    }
}

