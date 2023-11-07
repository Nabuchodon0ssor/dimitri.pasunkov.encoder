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
                            // saveTextToFile (newFilePath)
                            // Исходный текст зашифрован и находится в новом файле newFilePath! 
        







        
        
    }
}

